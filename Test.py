# example_keywords.py

# Boolean literals
true_val = True
false_val = False
none_val = None

# Logical operators
if true_val and not false_val or true_val:
    print("Logical operators used")

# Control flow
for i in range(5):
    if i == 3:
        break
    elif i == 2:
        continue
    else:
        pass

# Function definition
def example_function(x):
    global global_var
    global_var = x
    return x * 2

# Class definition
class MyClass:
    def __init__(self, value):
        self.value = value
    
    def display(self):
        print(f"Value is: {self.value}")

# Lambda function
double = lambda x: x * 2

# With statement
with open("sample.txt", "w") as f:
    f.write("with statement used")

# Try-except-finally block
try:
    x = 1 / 0
except ZeroDivisionError:
    print("Caught division by zero")
finally:
    print("Finally block executed")

# Raise exception
def check_positive(n):
    if n < 0:
        raise ValueError("Negative value not allowed")

# Async/await example (requires Python 3.5+)
import asyncio

async def async_func():
    await asyncio.sleep(1)
    print("Async function complete")

# Yield example
def generator():
    yield 1
    yield 2

# Nonlocal usage
def outer():
    count = 0
    def inner():
        nonlocal count
        count += 1
        return count
    return inner

# Import statement
import math
from math import sqrt

# Assert statement
assert true_val is True

# Del statement
temp = [1, 2, 3]
del temp[0]

# Final output
print("Script executed")
