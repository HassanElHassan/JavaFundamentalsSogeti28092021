package assignment32;

public enum Month {
    JANUARY("01", 31),
    FEBRUARY("02", 28),
    MARCH("03", 31),
    APRIL("04", 30),
    MAY("05", 31),
    JUNE("06", 30),
    JULY("07", 31),
    AUGUST("08", 31),
    SEPTEMBER("09", 30),
    OCTOBER("10", 31),
    NOVEMBER("11", 30),
    DECEMBER("12", 31);

    // Enum fields
    private final String monthNumber;
    private final int numberOfDays;

    // Enum constructor
    Month(String monthNumber, int numberOfDays) {
        this.monthNumber = monthNumber;
        this.numberOfDays = numberOfDays;
    }

    // Getters
    public String getMonthNumber() {
        return monthNumber;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

}
