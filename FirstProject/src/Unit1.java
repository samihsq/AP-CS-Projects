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

        System.out.print("Radius of circle? (Integer): ");
        String tempradius = kb.nextLine();
        int radius = Integer.parseInt(tempradius);

        double area = (PI) * (radius * radius);

        System.out.print("This is the area: ");
        System.out.printf("%.02f", area);

        System.out.println();
    }

    // [Problem 02 - Hot Dog]
    // This calculates the total cost for # of hot dogs a user wants to buy, including tax.
    // Tax rate is 10.25%.
    public static void hotDog()
    {
        double hotDogPrice = 2.50;
        double tax = 0.1025;

        System.out.print("Number of hot dogs: ");
        String hotDogString = kb.nextLine();
        int hotDogNumber = Integer.parseInt(hotDogString);

        double calcHotDog = hotDogNumber * hotDogPrice;
        double calcTax = calcHotDog * tax;
        double total = calcHotDog + calcTax;

        System.out.print("The price for " + hotDogNumber + " hot dogs is: $");
        System.out.printf("%.02f", calcHotDog);
        System.out.println();

        System.out.print("The tax would be: $");
        System.out.printf("%.02f", calcTax);
        System.out.println();

        System.out.print("The total price (including tax) would be: $");
        System.out.printf("%.02f", total);
        System.out.println();

    }

    // [Problem 03 - Hot Stuff]
    // A user will enter a temperature (int) in Fahrenhei
    // and it will be converted to the temperature Celsius (rounded to the nearest numbers)
    public static void hotStuff()
    {
        // Your own code here.
    }

    // [Problem 04 - Dream Team]
    // This puts players into a team of 6 and tells you how many teams it makes
    // and how many players are left without a team.
    public static void dreamTeam()
    {
        // Your own code here.
    }

    // [Problem 05 - Loose Change]
    // This takes in an integer in cents and give you the least coin combinations.
    public static void looseChange()
    {
        // Your own code here.
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