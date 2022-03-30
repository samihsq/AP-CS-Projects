package unit9InheritanceLab;

/**
 * Parallelogram.java - Unit 9 Lab
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 */

public class Parallelogram implements Shape{
    private double base;
    private double height;
    private double side;

    public Parallelogram() {
        // setting values in default constructor
        System.out.println("I am entering the Parallelogram's Default Constructor");
        this.base = 3;
        this.height = 1;
        this.side = 2;
        System.out.println("I am exiting the Parallelogram's Default Constructor");
    }
    public Parallelogram(double base, double height, double side) {
        // setting values in overloaded constructor
        System.out.println("I am entering the Parallelogram's Overloaded Constructor");
        this.base = base;
        this.height = height;
        this.side = side;
        System.out.println("I am exiting the Parallelogram's Overloaded Constructor");
    }

    public double area() {
        // solving area thru base * height
        return base * height;
    }

    public double perimeter() {
        // solving perimeter by adding side lengths
        return 2 * base + 2 * side;
    }

    public String toString() {
        return "I am a class Parallelogram with a base of " + base + ", a height of " + height + ", and a side of " + side;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
