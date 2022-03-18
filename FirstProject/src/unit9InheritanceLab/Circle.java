
/**
 * Circle.java - Unit 9 Lab
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 */

public class Circle extends Ellipse{
    public Circle() {
        // calls ellipse constructor with both as same
        super(1, 1);
        System.out.println("I am exiting the Circle's Default Constructor");
    }

    public Circle (double a) {
        // calls ellipse constructor with both as same
        super(a, a);
        System.out.println("I am exiting the Circle's Overloaded Constructor");
    }

    public double getRadius() {
        // calls both a and b are same, either can be called
        return super.getA();
    }

    public void setRadius(double rad) {
        // since ellipse has info, both a and b have to be changed to the same value
        super.setA(rad);
        super.setB(rad);
    }

    public String toString() {
        return "I am a class Circle with a radius of " + getRadius();
    }
}
