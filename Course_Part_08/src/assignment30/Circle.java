package assignment30;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = checkValue(radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle…");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2.0 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = checkValue(radius);
    }

}
