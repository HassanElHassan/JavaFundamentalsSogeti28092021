public class Assignment34 {
    public static void main(String[] args) {
        System.out.println(divide(15, 0));
        System.out.println(divide(18, 9));
    }

    public static Integer divide(int number1, int number2) {
        int result = 0;
        try {
            result = number1 / number2;
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Inside the finally block");
        }
        return result;

    }
}
