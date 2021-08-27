/**
 * Print.java for 1.2
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 * @author - I received help from nobody.
 *
 */

public class Print
{
    public static void example1() {
        // I didn't make any changes here.
        System.out.println("This is my first Java program!");
        System.out.print("I hope ");
        System.out.println("I will type everything correctly!");
        System.out.print("I also hope I will");
        System.out.println(" get an A in this class!");
    }


    public static void example2() {
        // Errors: missing semi-colon, missing quotation, indentation incorrect
        System.out.println("I" + "am" + "not" + "spacing things correctly.");
        System.out.println("I will correct this sentence above.");
        System.out.println("I will correct the sentences below.");
        System.out.print("First Name: ");
        System.out.println("Samih");
        System.out.print("Last Name: ");
        System.out.println("Qureshi");
    }


    public static void example3() {
        // START

        // Visually created answer key for 3(x+10)-5
        // Used print() between println() to print out text without creating new line
        System.out.print("3(x + 10) - 5 = ");
        System.out.println("10");
        System.out.print("3(x + 10)     = ");
        System.out.println("15");
        System.out.println(" (x + 10)     =  5");
        System.out.println("  x           = -5");

        // END

    }

    public static void main(String[] args)
    {
        // I didn't make any changes here
        System.out.println("Example 1:");
        example1();
        System.out.println();

        System.out.println("Example 2:");
        example2();
        System.out.println();

        System.out.println("Example 3:");
        example3();

    }
}