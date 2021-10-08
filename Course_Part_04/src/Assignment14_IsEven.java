public class Assignment14_IsEven {

    public static void main(String[] args) {

        int[] myArray = {5, -8, 4, 6, 9, -7};

        for (int num : myArray) {
            if (isEven(num)) {
                System.out.printf("The number %d is even%n", num);
            } else {
                System.out.printf("The number %d is odd%n", num);
            }
        }

    }

    private static boolean isEven(int num) {
        return num % 2 == 0;
    }

}
