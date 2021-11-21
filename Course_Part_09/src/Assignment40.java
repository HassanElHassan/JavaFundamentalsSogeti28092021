import java.util.HashMap;
import java.util.Map;

public class Assignment40 {
    public static void main(String[] args) {

        HashMap<Integer, String> colorMap = new HashMap<>();

        colorMap.put(1, "Red");
        colorMap.put(2, "Green");
        colorMap.put(3, "Orange");
        colorMap.put(4, "White");
        colorMap.put(5, "Black");
        System.out.println(colorMap);
        printLine();

        colorMap.forEach((Integer key, String value) -> System.out.println(key + "->" + value));
        printLine();

        for (Map.Entry entry : colorMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        printLine();

        for (Integer key : colorMap.keySet()) {
            System.out.println(key + "->" + colorMap.get(key));
        }
        printLine();

        System.out.println("The size of the hash map is: " + colorMap.size());
        printLine();

        System.out.println("Does the color map contain the key 6? " + (colorMap.containsKey(6)));

        System.out.println("Does the color map contain the value Red? " + (colorMap.containsValue("Red")));

        System.out.println("The color with key 3 is: " + colorMap.get(3));

        System.out.println("The color with key 2 is: " + colorMap.get(2));

        System.out.println("The hash map contains these keys: " + colorMap.keySet());

        System.out.println("The hash map contains these values: " + colorMap.values());

        colorMap.clear();
        System.out.println(colorMap);
        System.out.println("is the color map empty? " + colorMap.isEmpty());

    }

    public static void printLine() {
        System.out.println("--------------------------------------------------------------");
    }

}
