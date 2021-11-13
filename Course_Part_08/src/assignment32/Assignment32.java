package assignment32;

public class Assignment32 {
    public static void main(String[] args) {

        for (Month month : Month.values()) {
            System.out.printf("Month number of %s is %s and has %d days.%n",
                    month,
                    month.getMonthNumber(),
                    month.getNumberOfDays()
            );
        }
    }
}
