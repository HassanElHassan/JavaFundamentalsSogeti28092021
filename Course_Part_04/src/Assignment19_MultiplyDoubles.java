public class Assignment19_MultiplyDoubles {

    public static void main(String[] args) {

        double total;
        double d1 = 0.1;
        double d2 = 9.0;
        double d3 = 23.4;
        double d4 = 100;
        double d5 = 2.0;

        // multiplyDoubles with 3 doubles
        total = multiplyDoubles(d1, d2, d3);
        System.out.printf(
                "The multiplication of %f, %f and %f is: %f%n",
                d1,
                d2,
                d3,
                total);

        // multiplyDoubles with 5 doubles
        total = multiplyDoubles(d1, d2, d3, d4, d5);
        System.out.printf(
                "The multiplication of %f, %f, %f, %f and %f is: %f%n",
                d1,
                d2,
                d3,
                d4,
                d5,
                total);

    }

    private static double multiplyDoubles(double... numbers) {

        double total = 1;
        for (double num : numbers) {
            total *= num;
        }

        return total;

    }

}
