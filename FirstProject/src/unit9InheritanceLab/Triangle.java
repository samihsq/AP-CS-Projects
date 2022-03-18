
/**
 * Triangle.java - Unit 9 Lab
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 */

public class Triangle implements Shape{

    private double a;
    private double b;
    private double c;


    public Triangle() {
        System.out.println("I am entering the Triangle's Default Constructor");
        a = 1;
        b = 1;
        c = 1;
        System.out.println("I am exiting the Triangle's Default Constructor");
    }

    public Triangle(double a, double b, double c) {
        System.out.println("I am entering the Triangle's Overloaded Constructor");
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("I am exiting the Triangle's Overloaded Constructor");

    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        double s = perimeter()/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public String toString() {
        return "I am a class Triangle with 3 sides of " + a + ", " + b + ", and " + c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
