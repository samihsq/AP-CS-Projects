package randomstuff; /**
 * randomstuff.Casting.java
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 * @author - I received help from nobody
 *
 */

import java.util.Scanner;

public class Casting
{

    public static void example1()
    {
        int a = 3;
        int b = 4;
        System.out.println("a = 3, b = 4");
        System.out.println();

        // START

        // Returns 7 because the integers are added separately, then printed
        System.out.println("a + b is " + (a + b));

        // Needed to use backslashes in the next two statements to show quotation marks in output
        // Returns 34 because the integers are added together like Strings; no math, just concatenation
        System.out.println("\"\" + a + b is " + ("" + a + b));

        // Returns 1243 because 4, 5, and variable a are added like integers, then variables b and a are added like Strings
        System.out.println("4 + 5 + a + \"\" + b + a is " + (4 + 5 + a + "" + b + a));

        // Returns Result: 34 because the variables a and b are treated like Strings, and are concatenated, not added mathematically
        System.out.println("Result: + a + b is " + ("Result: " + a + b));

        // Returns Result: 7 because the variables are added mathematically first, then are printed out
        System.out.println("Result: + (a + b) is " + ("Result: " + (a + b)));

        // END
    }


    public static void example2()
    {
        int num1 = 3;
        int num2 = 4;
        double d_num1 = 3.0; // The equivalent of num1 except it is of type double instead of int
        double d_num2 = 4.0; // The equivalent of num2 except it is of type double instead of int

        // Test int cast to double
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println();

        // START


        // Returns 0 because of integer division
        System.out.println("num1 / num2 is 3/4 = " + num1 / num2);

        // Returns 0.75 because double and integer division -> double result
        System.out.println("(double)num1 / num2 is 3/4 = " + (double)num1 / num2);

        // Returns 0.75 because double and integer division -> double result
        System.out.println("(double)(num1) / num2 is 3/4 = " + (double)(num1) / num2);

        // Returns 0.0 because the integers are divided first, and that value is set as a double
        System.out.println("(double)(num1 / num2) is 3/4 = " + (double)(num1 / num2));


        // END
        System.out.println();
        System.out.println();

        // Test cast double to int
        System.out.println("d_num1 = " + d_num1 + ", d_num2 = " + d_num2);
        System.out.println();

        // START


        // Returns 0.75 because double divided by double returns a decimal
        System.out.println("d_num1 / d_num2 is 3.0/4.0 = " + d_num1 / d_num2);

        // Returns 0.75 because double and integer division -> double result
        System.out.println("(int)d_num1 / d_num2 is 3.0/4.0 = " + (int)d_num1 / d_num2);

        // Returns 0.75 because double and integer division -> double result
        System.out.println("(int)(d_num1) / d_num2 is 3.0/4.0 = " + (int)(d_num1) / d_num2);

        // Returns 0 because the doubles are divided first, then it is set to an integer (rounding the value down)
        System.out.println("(int)(d_num1 / d_num2) is 3.0/4.0 = " + (int)(d_num1 / d_num2));


        // END
    }

    public static void main(String[] args)
    {
        System.out.println("Example 1:");
        System.out.println("============");
        example1();
        System.out.println();

        System.out.println("Example 2:");
        System.out.println("============");
        example2();
    }
}