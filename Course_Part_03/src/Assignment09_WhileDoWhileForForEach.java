public class Assignment09_WhileDoWhileForForEach {

    public static void main(String[] args) {

        int[] myArray = {5, 8, 4, 6, 9, 7};
        int lenMyArray = myArray.length;
        int sum;
        int i;

        // while loop
        sum = 0;
        i = 0;
        while (i < lenMyArray) {
            sum += myArray[i];
            i++;
        }
        System.out.println("Sum of all numbers by while loop is " + sum);

        // do-while loop
        sum = 0;
        i = 0;
        do {
            sum += myArray[i];
            i++;
        } while ((i < lenMyArray));
        System.out.println("Sum of all numbers by do-while loop is " + sum);

        // for loop
        sum = 0;
        for (i = 0; i < lenMyArray; i++) {
            sum += myArray[i];
        }
        System.out.println("Sum of all numbers by for loop is " + sum);

        // for-each loop
        sum = 0;
        for (int num : myArray) {
            sum += num;
        }
        System.out.println("Sum of all numbers by for-each loop is " + sum);
    }
}
