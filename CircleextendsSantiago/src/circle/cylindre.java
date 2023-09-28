package circle;

public class cylindre extends circle {
    private double height;

    public cylindre(double radius) {
        super(radius);
        this.height = 1.0;
    }
    public cylindre(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public cylindre(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height=height;
    }

    public double getVolume() {
        return getArea() * height;
    }
    @Override
    public String toString() {
        return "radius= " + getRadius() + " Color= " +getColor() + ", Height: " + height;
    }

    public void printCylinder() {
        System.out.println("Height= "+ height);
    }
}
