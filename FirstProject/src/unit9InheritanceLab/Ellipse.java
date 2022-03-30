package unit9InheritanceLab;
/**
 * Ellipse.java - Unit 9 Lab
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 */

public class Ellipse implements Shape{

    private double a;
    private double b;

    public Ellipse() {
        // setting values in default constructor
        System.out.println("I am entering the Ellipse's Default Constructor");
        this.a = 2;
        this.b = 1;
        System.out.println("I am exiting the Ellipse's Default Constructor");
    }

    public Ellipse(double a, double b) {
        // setting values in overloaded constructor
        System.out.println("I am entering the Ellipse's Overloaded Constructor");
        this.a = a;
        this.b = b;
        System.out.println("I am exiting the Ellipse's Overloaded Constructor");
    }

    public double perimeter() {
        // solving perimeter with ellipse formula
        return 2 * Math.PI * Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2))/2.0);
    }

    public double area() {
        // solving area with ellipse formula
        return Math.PI * a * b;
    }

    public String toString() {
        return "I am a class Ellipse with a-axis of " + a + " and b-axis of " + b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
