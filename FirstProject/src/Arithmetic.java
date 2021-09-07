/**
 * Arithmetic.java for 1.4
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 * @author - I received help from nobody.
 *
 */
import java.util.Scanner;
// Imported math library
import java.math.*;


public class Arithmetic
{
    /**
     * When declaring a variable, we must first distinguish its type.
     * There are many types, but this lab will only focus on:
     * integer, double, and String
     */

    public static void example1()
    {
        // No changes made here
        int x = 5;
        int y = 8;

        System.out.println("x = " + x + ", y = " + y);
        System.out.print("x + y = ");
        System.out.println(x + y);
        System.out.print("x * y = ");
        System.out.println(x * y);
        System.out.print("x / y = ");
        System.out.println(x / y);
        System.out.println();
    }

    public static void example2()
    {
        // No changes made here
        int x = 5;
        int y = 8;
        double dnum = 10;

        System.out.println("dnum = " + dnum);
        System.out.print("dnum * dnum = ");
        System.out.println(dnum * dnum);
        System.out.print("dnum * x = ");
        System.out.println(dnum * x);
        System.out.println();
    }

    public static void example3()
    {

        // No changes made here
        int x = 5;
        int y = 8;
        double dnum = 10;

        System.out.print("x / y * dnum = ");
        System.out.println(x / y * dnum);
        System.out.print("dnum * x / y = ");
        System.out.println(dnum * x / y);
        System.out.println();
    }

    public static void example4()
    {
        int x = 5;
        int y = 8;

        System.out.println("x = " + x + ", y = " + y);
        System.out.print("Before x++, x is: ");
        System.out.print(x);
        // Changed from x++ -> x += 1
        x += 1;
        System.out.print(".  After x++, x is: ");
        System.out.println(x);
        System.out.print("Before y--, y is: ");
        System.out.print(y);
        // Changed from y-- -> y -= 1
        y -= 1;
        System.out.print(".  After y--, y is: ");
        System.out.println(y);
        System.out.println();
    }


    public static void example5()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please Enter your name: ");

        // START

        // Added scanner nextLine() code, assigned it to variable
        String name = kb.nextLine();

        // Printed the name that was recieved from input
        System.out.println("Hello " + name + "!");

        // Printed extra line so that the output looks cleaner
        System.out.println();

        // END

        // Commented kb.close() because it was causing errors with my IDE
        // kb.close();
    }

     public static void example6()
     {
         // Replaced !REPLACE! with Mean, because this function calculates the average of 5 numbers
         System.out.println("Mean");

         int num_of_terms = 5;
         int total = 0;
         Scanner kb = new Scanner(System.in);

         System.out.print("Enter a number: ");
         total = total + kb.nextInt();
         System.out.print("Enter a number: ");
         total += kb.nextInt();
         System.out.print("Enter a number: ");
         total += kb.nextInt();
         System.out.print("Enter a number: ");
         total += kb.nextInt();
         System.out.print("Enter the last number: ");
         total += kb.nextInt();

         double mystery = (double) total / num_of_terms;

         // Changed !REPLACE! to mean
         System.out.println("The mean of the 5 numbers is " + mystery);
         System.out.println();

         // Commented kb.close() because it was causing errors with my IDE
         // kb.close();

     }


    public static void example7()
    {
        Scanner kb = new Scanner(System.in);
        // START

        // Had 3 scanner instances to ask for each variable
        System.out.print("Enter a = ");
        int a = kb.nextInt();

        System.out.print("Enter b = ");
        int b = kb.nextInt();

        System.out.print("Enter c = ");
        int c = kb.nextInt();

        // calculated 2 solutions to the quadratic
        double solution1 = ((-b) + (Math.sqrt((b * b) - 4 * (a * c)))) / (2 * a);
        double solution2 = ((-b) - (Math.sqrt((b * b) - 4 * (a * c)))) / (2 * a);

        // used if statement (not learned yet) to check which solution is larger
        // prints larger solution using logic
        if (solution1 >= solution2) {

            System.out.println("The two roots are: " + solution1 + ", " + solution2);

        } else {

            System.out.println("The two roots are: " + solution2 + ", " + solution1);

        }

        // END

        // Commented kb.close() because it was causing errors with my IDE
        // kb.close();
    }

    public static void main(String[] args)
    {
        System.out.println("Example 1:");
        System.out.println("============");
        example1();

        System.out.println("Example 2:");
        System.out.println("============");
        example2();

        System.out.println("Example 3:");
        System.out.println("============");
        example3();

        System.out.println("Example 4:");
        System.out.println("============");
        example4();

        System.out.println("Example 5:");
        System.out.println("============");
        example5();

        System.out.println("Example 6:");
        System.out.println("============");
        example6();

        System.out.println("Example 7:");
        System.out.println("============");
        example7();
    }
}