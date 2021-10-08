public class Assignment16_IsPrime {

    public static void main(String[] args) {

        for (int num = 2; num < 101; num++) {
            if (isPrime(num)) {
                System.out.printf("The number %d is prime%n", num);
            } else {
                System.out.printf("The number %d is not a prime%n", num);
            }
        }

    }

    private static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }
}
