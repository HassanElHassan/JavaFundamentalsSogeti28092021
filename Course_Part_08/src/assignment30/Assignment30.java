package assignment30;

public class Assignment30 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(20.5, 30.1);
        rectangle.draw();
        printShapeInfo(rectangle.getName(), rectangle.calculateArea(), rectangle.calculatePerimeter());

        Circle circle = new Circle(52.12);
        circle.draw();
        printShapeInfo(circle.getName(), circle.calculateArea(), circle.calculatePerimeter());

        Square square = new Square(20.0);
        square.draw();
        printShapeInfo(square.getName(), square.calculateArea(), square.calculatePerimeter());

        rectangle.setWidth(10.25);
        rectangle.setHeight(15.05);
        printShapeInfo(rectangle.getName(), rectangle.calculateArea(), rectangle.calculatePerimeter());

        circle.setRadius(26.06);
        printShapeInfo(circle.getName(), circle.calculateArea(), circle.calculatePerimeter());

        square.setSide(10.0);
        printShapeInfo(square.getName(), square.calculateArea(), square.calculatePerimeter());

        rectangle.setWidth(-5);
        rectangle.setHeight(-10);
        printShapeInfo(rectangle.getName(), rectangle.calculateArea(), rectangle.calculatePerimeter());

        circle.setRadius(-3);
        printShapeInfo(circle.getName(), circle.calculateArea(), circle.calculatePerimeter());

        square.setSide(-7);
        printShapeInfo(square.getName(), square.calculateArea(), square.calculatePerimeter());
    }

    // Instead of println(String.format()) the printf() used
    public static void printShapeInfo(String name, double area, double perimeter) {
        System.out.printf("The %s has an area of %.2f and a perimeter of %.3f%n",
                name,
                area,
                perimeter);

    }

}
