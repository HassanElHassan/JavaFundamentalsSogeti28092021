public class Assignment08c_TernaryOperator {

    public static void main(String[] args) {
        int a = 10;
        int b = -21;

        // Smallest number will be printed
        System.out.println((a < b) ? a : b);

        // Largest number will be printed
        System.out.println((a < b) ? b : a);

        // The absolute value of b will be printed
        // example with b=-21: -21-(-21*2) = -21--42 = -21+42 = 21
        System.out.println((b >= 0) ? b : (b - (b * 2)));

        // If flower is larger than 1 the following will be printed, flower=2: There are 2 flowers on the table
        // If flower is less than 1 the following will be printed, flower=1: There is 1 flower on the table
        // Code is not optimal. If flower is zero the following will be printed:  There is 0 flower on the table
        int flower = 2;
        System.out.println(
                "There" +
                        ((flower > 1) ? (" are " + flower + " flowers") : (" is " + flower + " flower"))
                        + " on the table"
        );

    }
}
