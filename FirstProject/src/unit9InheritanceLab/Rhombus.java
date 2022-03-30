package unit9InheritanceLab;

/**
 * Rhombus.java - Unit 9 Lab
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 */

public class Rhombus extends Parallelogram{
    public Rhombus() {
        // setting base and side as the same because all side lengths are the same in rhombus
        super(2,1,2);
        System.out.println("I am exiting the Rhombus's Default Constructor");
    }

    public Rhombus(double side, double height) {
        // setting base and side as the same because all side lengths are the same in rhombus
        super(side, height, side);
        System.out.println("I am exiting the Rhombus's Overloaded Constructor");
    }

    public void setSide(double side) {
        // setting both because of inheritance from Parallelogram
        super.setSide(side);
        super.setBase(side);
    }

    public String toString() {
        return "I am a class Rhombus with a side of " + super.getSide() + " and a height of " + super.getHeight();
    }
}
