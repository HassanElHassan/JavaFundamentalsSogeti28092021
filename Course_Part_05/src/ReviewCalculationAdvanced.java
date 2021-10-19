public class ReviewCalculationAdvanced {

    public static void main(String[] args) {

        double[] numbers1 = {5.6443, 2.3};
        double[] numbers2 = {2.4, 4.8};
        String[] operators = {"+", "-", "*", "/", "%" };

        int TotalCalculations = calculation(numbers1, numbers2, operators);
        System.out.println("Total number of calculations: " + TotalCalculations);

    }

    private static int calculation(double[] numbers1, double[] numbers2, String[] operators) {
        int TotalCalculations = 0;
        for (double number1 : numbers1) {
            for (double number2 : numbers2) {
                for (String operator : operators) {
                    double result = calculator(number1, number2, operator);
                    printResults(number1, number2, operator, result);
                    TotalCalculations++;
                }
            }
        }
        return TotalCalculations;
    }

    private static double calculator(double number1, double number2, String operator) {
        switch (operator) {
            case "+": {
                return number1 + number2;
            }
            case "-": {
                return number1 - number2;
            }
            case "*": {
                return number1 * number2;
            }
            case "/": {
                return number1 / number2;
            }
            case "%": {
                return number1 % number2;
            }
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }

    private static void printResults(double number1, double number2, String operator, double result) {
        System.out.printf("The calculation %.2f %s %.2f = %.2f -> result is %s%n",
                number1,
                operator,
                number2,
                result,
                (result < 0) ? "negative" : "positive"
        );
    }

}
