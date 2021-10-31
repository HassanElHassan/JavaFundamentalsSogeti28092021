public class Car {

    private String name;
    private int currentSpeed = 0;
    private int topSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printCurrentSpeed() {
        System.out.println("Current speed is: " + currentSpeed);
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void printOverview() {
        System.out.printf(
                "This %s has a current speed of %d km/h and has a top speed of %d km/h%n",
                name,
                currentSpeed,
                topSpeed
        );
    }

    public void increaseSpeed(int speed) {
        int newSpeed = currentSpeed + speed;
        if (speed < 0) {
            System.out.println("Cannot decrease speed with this method");
        } else if (newSpeed >= topSpeed) {
            currentSpeed = topSpeed;
            System.out.printf(
                    "Top speed of %s has been reached: %d km/h%n",
                    name,
                    topSpeed
            );
        } else {
            currentSpeed = newSpeed;
        }
    }

}
