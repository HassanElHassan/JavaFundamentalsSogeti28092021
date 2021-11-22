import java.util.ArrayList;
import java.util.Collections;

public class Assignment37 {
    public static void main(String[] args) {

        // An ArrayList of cars
        ArrayList<String> carList = new ArrayList<>();

        // Add cars to ArrayList
        carList.add("BMW");
        carList.add("Mercedes");
        carList.add("Opel");
        carList.add("Volvo");
        carList.add("Fiat");

        // Print the ArrayList object carList
        System.out.println("ArrayList object carList:");
        System.out.println(carList);

        // Print the ArrayList object, element by element using for each
        System.out.println("carList element by element using for each:");
        for (String car : carList) {
            System.out.println(car);
        }
        // Print the ArrayList object, element by element using for each and lambda expression
        System.out.println("carList element by element using for each and lambda:");
        carList.forEach(car -> System.out.println(car)); // option: carList.forEach(System.out::println);

        // An ArrayList of numbers
        ArrayList<Integer> numbersList = new ArrayList<>();
        Collections.addAll(numbersList, 5, 42, 63, 71, 12, -31, 4);

        // Print the ArrayList object numbersList
        System.out.println("ArrayList object numbersList:");
        System.out.println(numbersList);

        // Print the min of numbersList
        System.out.println("The min of numbersList:");
        System.out.println(Collections.min(numbersList));

        // Print the max of numbersList
        System.out.println("The max of numbersList:");
        System.out.println(Collections.max(numbersList));

        // Sort numbersList
        System.out.println("numbersList sorted:");
        Collections.sort(numbersList);
        System.out.println(numbersList);

    }
}
