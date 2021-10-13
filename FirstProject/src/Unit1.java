/**
 * Unit1.java
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 * @author - I received help from nobody.
 *
 */

import java.util.Scanner;

public class Unit1
{
    private static Scanner kb = new Scanner(System.in);

    public static void circleArea()
    {

        // Value of pi set as a final (can't be changed)
        final double PI = 3.14;

        // Asks for input using Scanner
        System.out.println("Please enter the radius [int] of a circle: ");
        int radius = kb.nextInt();

        // Formula to find the area of the circle
        double area = (PI) * (radius * radius);

        // Prints out calculated area with %.02f formatting
        System.out.print("The area of a circle with a radius of " + radius + " is: ");
        System.out.printf("%.02f", area);

        System.out.println(".");
    }


    public static void hotDog()
    {

        // Set hotDogPrice and tax prices (using camelCase)
        double hotDogPrice = 2.50;
        double tax = 0.1025;

        // Asks for input using Scanner
        System.out.println("One hot dog is $2.50. Please enter the number of hot dogs you want to buy: ");
        int hotDogNumber = kb.nextInt();

        // Uses camelCase for variables, calculates using hotDogPrice + tax variables
        double calcHotDog = hotDogNumber * hotDogPrice;
        double calcTax = calcHotDog * tax;
        double total = calcHotDog + calcTax;

        // Prints out calculated values, using %.02f formatting
        System.out.print("Pretax cost: $");
        System.out.printf("%.02f", calcHotDog);
        System.out.println();

        System.out.print("Tax: $");
        System.out.printf("%.02f", calcTax);
        System.out.println();

        System.out.print("Final cost : $");
        System.out.printf("%.02f", total);
        System.out.println();

    }


    public static void hotStuff()
    {

        // Asks for input using Scanner
        System.out.println("Please enter a temperature (int) greater or equal to 32 in Fahrenheit: " );
        int temperature = kb.nextInt();

        // Uses casting (double) to convert
        double celsius = ( (double) 5 / 9) * (temperature - 32) + 0.5;

        // Prints celsius in int format using casting
        System.out.println(temperature + " degrees Fahrenheit is " + (int) celsius + " degrees Celsius.");
    }


    public static void dreamTeam()
    {

        // Asks for input using Scanner
        System.out.println("Please enter a number of players to divide into teams: ");
        int students = kb.nextInt();

        // Calculates using modulo and division
        int teams = students / 6;
        int leftover = students % 6;

        // Prints out calculated values
        System.out.println("We can make " + teams + " teams of six with " + leftover + " players left over.");

    }


    public static void looseChange()
    {

        // Asks for input using Scanner
        System.out.println("Please enter a number of cents to divide into change:");
        int cents = kb.nextInt();

        // Divides using values of coins (quarter: 25)
        int quarters = cents / 25;
        cents -= quarters * 25;

        // Divides using dime value: 10
        int dimes = cents / 10;
        cents -= dimes * 10;

        // Divides using nickel value: 5
        int nickels = cents / 5;
        cents -= nickels * 5;

        // Uses remaining amount as pennies
        int pennies = cents;

        // Prints out number of each type sequentially
        System.out.println("Your change is:");

        System.out.println("Quarters: " + quarters);

        System.out.println("Dimes: " + dimes);

        System.out.println("Nickels: " + nickels);

        System.out.println("Pennies: " + pennies);

        // Multiplying each type of coin by their value to reiterate the value of the coins
        System.out.println("Total: " + (quarters * 25 + dimes * 10 + nickels * 5 + pennies) + " cents");
    }

    public static void main(String[] args)
    {
        System.out.println("[Problem 01 - Calculate an Area for a Circle]");
        circleArea();
        System.out.println();
        System.out.println("[Problem 02 - Hot Dog]");
        hotDog();
        System.out.println();
        System.out.println("[Problem 03 - Hot Stuff]");
        hotStuff();
        System.out.println();
        System.out.println("[Problem 04 - Dream Team]");
        dreamTeam();
        System.out.println();
        System.out.println("[Problem 05 - Loose Change]");
        looseChange();
        kb.close();
    }
}