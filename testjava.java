// JavaKeywordDemo.java

package demo;

import java.util.*;

public class JavaKeywordDemo {

    // Reserved keywords and data types
    public static final boolean CONST_BOOLEAN = true;
    private static int count = 0;
    private double pi = 3.14;
    protected String message = "Hello Java";

    public static void main(String[] args) {
        // Common identifiers
        System.out.println("Java Keywords Demo");

        // if-else
        if (CONST_BOOLEAN && count == 0) {
            System.out.println("True and zero");
        } else if (count > 0) {
            System.out.println("Greater than zero");
        } else {
            System.out.println("Fallback case");
        }

        // for loop
        for (int i = 0; i < 3; i++) {
            System.out.println("i: " + i);
        }

        // while loop
        int x = 0;
        while (x < 2) {
            x++;
        }

        // do-while loop
        do {
            x--;
        } while (x > 0);

        // switch-case
        int val = 2;
        switch (val) {
            case 1:
                break;
            case 2:
                System.out.println("Switch matched 2");
                break;
            default:
                break;
        }

        // try-catch-finally
        try {
            int y = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception");
        } finally {
            System.out.println("Finally executed");
        }

        // instance of, new, return
        Object obj = new JavaKeywordDemo();
        if (obj instanceof JavaKeywordDemo) {
            System.out.println("It's a JavaKeywordDemo instance");
        }

        // static method call
        JavaKeywordDemo.staticMethod();

        // Creating anonymous class to use abstract/interface
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable run");
            }
        };
        r.run();
    }

    // Method using keywords
    public static synchronized void staticMethod() {
        final int finalValue = 5;
        int[] nums = {1, 2, 3};
        for (int n : nums) {
            System.out.println("Number: " + n);
        }
    }

    // native, strictfp, transient, volatile, throws demo
    public native void nativeMethod(); // Placeholder

    public strictfp double getStrictValue() {
        return 10.0;
    }

    private transient int tempData;
    private volatile boolean flag;

    public void throwingMethod() throws Exception {
        throw new Exception("Throwing method exception");
    }
}
