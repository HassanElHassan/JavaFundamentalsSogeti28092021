import com.sun.source.tree.IfTree;

public class Assignment08a_ConditionalStatements {

    public static void main(String[] args) {

        String name = "Bob";

        if (name.equals("John")) {
            System.out.println("His name is John");
        } else if (name.equals("Doe")) {
            System.out.println("His name is Doe");
        } else {
            System.out.println("His name is neither John nor Doe");
        }

    }
}
