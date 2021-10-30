public class Point {

    private int x;
    private int y;

    public Point(){
        System.out.println("The default constructor has been used!");
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println("Parameterized constructor has been used!");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void printCoordinates(){
        System.out.printf(
                "The x value is %d and the y value is %d",
                getX(), //this.x
                getY() // this.y
        );
    }


}
