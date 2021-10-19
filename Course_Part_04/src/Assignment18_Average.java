public class Assignment18_Average {

    public static void main(String[] args) {

        int[] nums = {5, -8, 4, 6, 9, -3};
        double avrg = average(nums);
        System.out.println("The average value of all numbers in the array is: " + avrg);

    }

    private static double average(int[] nums) {

        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / nums.length;

    }
}
