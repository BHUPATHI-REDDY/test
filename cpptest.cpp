#include <iostream>
#include <regex>
#include <string>

int main() {
    // Regular expression to test (double escape backslashes if using raw string)
    std::regex pattern(R"(#include\s+<[^>]+>|#define\s+\w+\s+.+|#(ifdef|ifndef|endif|pragma)\s+[^\n]+|class\s+\w+|struct\s+\w+|template\s*<[^>]+>\s*class\s+\w+|namespace\s+\w+|using\s+namespace\s+\w+;|int\s+\w+\s*\([^)]*\)\s*\{?|void\s+\w+\s*\([^)]*\)\s*\{?|[\w:]+::\w+\s*\([^)]*\)\s*\{?|if\s*\([^)]+\)\s*\{?|else\s*\{?|for\s*\([^)]+\)\s*\{?|while\s*\([^)]+\)\s*\{?|switch\s*\([^)]+\)\s*\{?|case\s+[^:]+:|default\s*:|return\s+[^;\n]+;?|break;|continue;|throw\s+[^;\n]+;?|//[^\n]*|/\*[\s\S]*?\*/|\".*?\"|\'.*?\')");

    // Sample code lines to test
    std::string lines[] = {
        "#include <iostream>",
        "int main() {",
        "std::cout << \"Hello World\" << std::endl;",
        "// This is a comment",
        "return 0;",
        "class MyClass {",
        "std::string name = \"test\";",
        "}"
    };

    for (const std::string& line : lines) {
        if (std::regex_search(line, pattern)) {
            std::cout << "MATCH: " << line << std::endl;
        } else {
            std::cout << "NO MATCH: " << line << std::endl;
        }
    }

    return 0;
}
