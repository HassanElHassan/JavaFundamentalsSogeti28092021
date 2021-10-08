import java.util.Arrays;

public class Assignment13_SimpleCalculator {

    public static void main(String[] args) {

        double a = 1;
        double b = 3;
        // Options: addition, subtraction, multiplication or division
        calculatorPrint(a, b, "addition");
        calculatorPrint(a, b, "subtraction");
        calculatorPrint(a, b, "multiplication");
        calculatorPrint(a, b, "division");
        calculatorPrint(a, b, "multidivaddsub");

    }

    private static void calculatorPrint(double a, double b, String operator) {

        String[] operators = {"addition", "subtraction", "multiplication", "division"};
        if (Arrays.asList(operators).contains(operator)) {
            double value = calculator(a, b, operator);
            System.out.printf("The %s of %f and %f is: %f%n",
                    operator,
                    a,
                    b,
                    value);
        } else {
            System.out.printf("%s is not a valid operator!", operator);
        }

    }

    private static Double calculator(double a, double b, String operator) {

        switch (operator) {
            case "addition": {
                return a + b;
            }
            case "subtraction": {
                return a - b;
            }
            case "multiplication": {
                return a * b;
            }
            case "division": {
                return a / b;
            }
            default: {
                return null;
            }
        }
    }

}