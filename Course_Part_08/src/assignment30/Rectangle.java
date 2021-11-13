package assignment30;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = check_value(width);
        this.height = check_value(height);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle…");
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2.0 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = check_value(width);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = check_value(height);
    }

}
