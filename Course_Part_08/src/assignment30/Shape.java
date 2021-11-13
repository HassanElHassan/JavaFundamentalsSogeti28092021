package assignment30;

public abstract class Shape {

    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract void draw();

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public double check_value(double side) {
        if (side < 0) {
            return 0;
        } else {
            return side;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
