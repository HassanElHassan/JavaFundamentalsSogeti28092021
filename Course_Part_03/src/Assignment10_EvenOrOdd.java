public class Assignment10_EvenOrOdd {

    public static void main(String[] args) {

        int[] myArray = {5, 8, 4, 6, 9, 7};

        // loop over array using the fo-each loop to loop over array items one by one
        // using the remainder/modulus (%) operator we can distinguish between odd and even numbers
        // when dividing an even number by 2 the % operator will result in a 0
        for (int num : myArray) {
            if (num % 2 == 0) {
                System.out.println(num + " is an even number");
            } else {
                System.out.println(num % 2);
                System.out.println(num + " is an odd number");
            }

        }

    }
}
