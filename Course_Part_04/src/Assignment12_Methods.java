public class Assignment12_Methods {

    public static void main(String[] args) {
        printGreetingMessageToConsole();
        System.out.println(getJavaGreeting());
        printNameToConsole("Hello John, welcome to the Java course :)");
        System.out.println(sumOfIntegers(10, 20));
    }

    /**
     * A method to print Hello World! to the console
     */
    public static void printGreetingMessageToConsole() {
        System.out.println("Hello World!");
    }

    /**
     * A method to get a greeting
     *
     * @return the greeting "The greetings is Hello Java"
     */
    public static String getJavaGreeting() {
        return "The greetings is Hello Java";
    }

    /**
     * A method that takes a String and prints it to the console
     *
     * @param txt - The String that will be printed to the console
     */
    public static void printNameToConsole(String txt) {
        System.out.println(txt);
    }

    /**
     * A method that takes two integers and returns a string containing the sum of both
     *
     * @param x - First integer
     * @param y - Second integer
     * @return the string "The sum of {x} and {y} is {sum x and y}"
     */
    public static String sumOfIntegers(int x, int y) {
        int z = x + y;
        return String.format("The sum of %d and %d is %d", x, y, z);
    }

}
