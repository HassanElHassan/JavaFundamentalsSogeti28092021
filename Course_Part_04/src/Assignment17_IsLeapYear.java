import java.util.Arrays;

public class Assignment17_IsLeapYear {

    public static void main(String[] args) {

        int[] years = {1990, 2008, 2011, 2020, 2021, 2050};
        for (int year : years) {
            if (isLeapYear(year)) {
                System.out.printf("The year %d is a leap year.%n", year);
            } else {
                System.out.printf("The year %d is a not leap year.%n", year);
            }
        }

    }

    private static boolean isLeapYear(int year) {

        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else return (year % 4 == 0) && (year % 400 == 0);

    }
}
