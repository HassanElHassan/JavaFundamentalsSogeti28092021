import java.util.HashMap;
import java.util.Map;

public class Assignment38 {
    public static void main(String[] args) {

        HashMap<Integer, String> shapesMap = new HashMap<>();
        shapesMap.put(1, "Rectangle");
        shapesMap.put(2, "Circle");
        shapesMap.put(3, "Triangle");
        shapesMap.put(4, "Square");
        shapesMap.put(5, "Octagon");
        shapesMap.put(6, "Ellipse");
        System.out.println(shapesMap);

        System.out.println();
        // shapesMap.forEach((Integer key, String value) -> System.out.println(key + "->" + value));
        shapesMap.forEach((key, value) -> System.out.println(key + "->" + value));

        System.out.println();
        for (Map.Entry entry : shapesMap.entrySet()) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println();
        for (Integer key : shapesMap.keySet()) {
            System.out.println(key + "->" + shapesMap.get(key));
        }

    }
}
