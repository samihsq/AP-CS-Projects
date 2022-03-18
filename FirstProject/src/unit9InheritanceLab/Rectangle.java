
/**
 * Rectangle.java - Unit 9 Lab
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 */

public class Rectangle extends Parallelogram{
    public Rectangle() {
        // setting height and side as the same because only 2 different values for rectangle
        super(2,1,1);
        System.out.println("I am exiting the Rectangle's Default Constructor");
    }

    public Rectangle(double base, double height) {
        // setting height and side as the same because only 2 different values for rectangle
        super(base, height, height);
        System.out.println("I am exiting the Rectangle's Overloaded Constructor");

    }

    public double getLength() {
        // renamed
        return super.getBase();
    }

    public double getWidth() {
        // renamed, either getHeight or getSide works
        return super.getHeight();
    }

    public void setLength(double length) {
        // renamed
        super.setBase(length);
    }

    public void setWidth(double length) {
        // renamed, need to set both because of inheritance from Parallelogram
        super.setHeight(length);
        super.setSide(length);
    }

    public String toString() {
        return "I am a class Rectangle with a length of " + getLength() + " and a width of " + getWidth();
    }
}
