import java.util.ArrayList;
import java.util.Collections;

public class Assignment39 {
    public static void main(String[] args) {

        // An ArrayList of colors
        ArrayList<String> colorList = new ArrayList<>();

        // Add colors to ArrayList
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("White");
        colorList.add("Black");

        // Print the ArrayList object
        System.out.println(colorList);
        printLine();

        // Print the ArrayList object, element by element
        // for each and lambda expression: colorList.forEach(color -> System.out.println(color));
        colorList.forEach(System.out::println);
        printLine();

        // Print the size of the ArrayList
        System.out.println("The size of the array list is: " + colorList.size());
        printLine();

        // Add Pink to the ArrayList at index 0
        colorList.add(0, "Pink");

        // Add Pink to the ArrayList at index 5
        colorList.add(5, "Yellow");

        // Print the ArrayList object
        System.out.println(colorList);
        printLine();

        // Color at index 0
        System.out.println("Color at index 0 is " + colorList.get(0));

        // Color at index 3
        System.out.println("Color at index 3 is " + colorList.get(3));
        printLine();

        // Change color at index 5
        colorList.set(5, "Blue");
        System.out.println(colorList);
        printLine();

        // Remove color at index 4
        colorList.remove(4);
        System.out.println(colorList);
        printLine();

        // Search for color
        if (colorList.contains("Green")) System.out.println("Found the color Green!");
        printLine();

        // List before and after sort
        System.out.println("ColorList before sort: " + colorList);
        Collections.sort(colorList);
        System.out.println("ColorList after sort: " + colorList);

    }

    public static void printLine() {
        System.out.println("--------------------------------------------------------------");
    }

}
