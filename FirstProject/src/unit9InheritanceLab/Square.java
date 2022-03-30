package unit9InheritanceLab;

/**
 * Square.java - Unit 9 Lab
 *
 * @author - Samih Qureshi
 * @author - Period 3
 * @author - Id 10023090
 *
 */

public class Square extends Rectangle{
    public Square() {
        // setting both length and width to 1 because square side lengths are the same
        super(1,1);
        System.out.println("I am exiting Square's Default Constructor");
    }

    public Square(double side) {
        // setting both length and width to variable side because square side lengths are the same
        super(side, side);
        System.out.println("I am exiting Square's Overloaded Constructor");

    }

    public void setSide(double side) {
        // setting both length and width because of inheritance from Rectangle

        super.setLength(side);
        super.setWidth(side);
    }

    public String toString() {
        return "I am a class Square with a side of " + super.getBase();
    }

}
