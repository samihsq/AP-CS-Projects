package unit9InheritanceLab;

public class Parallelogram implements Shape{
    private double base;

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

    private double height;
    private double side;

    public Parallelogram() {
        this.base = 3;
        this.height = 1;
        this.side = 2;
    }
    public Parallelogram(double base, double height, double side) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double area() {
        return base * height;
    }

    public double perimeter() {
        return 2 * base + 2 * side;
    }
}
