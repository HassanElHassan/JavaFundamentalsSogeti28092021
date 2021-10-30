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
        System.out.println("Current speed is: " + this.currentSpeed);
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
                this.name,
                this.currentSpeed,
                this.topSpeed
        );
    }

    public void increaseSpeed(int speed) {
        int newSpeed = this.currentSpeed + speed;
        if (speed < 0) {
            System.out.println("Cannot decrease speed with this method");
        } else if (newSpeed >= this.topSpeed) {
            this.currentSpeed = this.topSpeed;
            System.out.printf(
                    "Top speed of Ferrari has been reached: %d km/h%n",
                    this.topSpeed
            );
        } else {
            this.currentSpeed = newSpeed;
        }
    }


//
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        if ( speed < 0){
//            this.speed = 0;
//        } else {
//            this.speed =speed;
//        }
//    }
//
//    public boolean isFast() {
//        return fast;
//    }
//
//    public void setFast(boolean fast) {
//        this.fast = fast;
//    }

}
