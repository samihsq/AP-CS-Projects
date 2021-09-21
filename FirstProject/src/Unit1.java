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

    // [Problem 01 - Calculate an Area for a Circle]
    // A user enters the radius (int) for the circle and it prints the area of the circle (double).
    public static void circleArea()
    {
        final double PI = 3.14;

        System.out.println("Please enter the radius [int] of a circle: ");
        int radius = kb.nextInt();

        double area = (PI) * (radius * radius);

        System.out.print("The area of a circle with a radius of " + radius + " is: ");
        System.out.printf("%.02f", area);

        System.out.println(".");
    }

    // [Problem 02 - Hot Dog]
    // This calculates the total cost for # of hot dogs a user wants to buy, including tax.
    // Tax rate is 10.25%.
    public static void hotDog()
    {
        double hotDogPrice = 2.50;
        double tax = 0.1025;

        System.out.println("One hot dog is $2.50. Please enter the number of hot dogs you want to buy: ");
        int hotDogNumber = kb.nextInt();

        double calcHotDog = hotDogNumber * hotDogPrice;
        double calcTax = calcHotDog * tax;
        double total = calcHotDog + calcTax;

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

    // [Problem 03 - Hot Stuff]
    // A user will enter a temperature (int) in Fahrenhei
    // and it will be converted to the temperature Celsius (rounded to the nearest numbers)
    public static void hotStuff()
    {
        System.out.println("Please enter a temperature (int) greater or equal to 32 in Fahrenheit: " );
        int temperature = kb.nextInt();

        double celsius = ( (double) 5 / 9) * (temperature - 32) + 0.5;

        System.out.println(temperature + " degrees Fahrenheit is " + (int) celsius + " degrees Celsius.");
    }

    // [Problem 04 - Dream Team]
    // This puts players into a team of 6 and tells you how many teams it makes
    // and how many players are left without a team.
    public static void dreamTeam()
    {
        System.out.println("Please enter a number of players to divide into teams: ");
        int students = kb.nextInt();

        int teams = students / 6;
        int leftover = students % 6;

        System.out.println("We can make " + teams + " teams of six with " + leftover + " players left over.");

    }

    // [Problem 05 - Loose Change]
    // This takes in an integer in cents and give you the least coin combinations.
    public static void looseChange()
    {
        System.out.println("Please enter a number of cents to divide into change:");
        int cents = kb.nextInt();

        int quarters = cents / 25;
        cents -= quarters * 25;

        int dimes = cents / 10;
        cents -= dimes * 10;

        int nickels = cents / 5;
        cents -= nickels * 5;

        int pennies = cents;

        System.out.println("Your change is:");

        System.out.println("Quarters: " + quarters);

        System.out.println("Dimes: " + dimes);

        System.out.println("Nickels: " + nickels);

        System.out.println("Pennies: " + pennies);

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