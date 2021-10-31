public class Assignment23ClassCar {

    public static void main(String[] args) {

        // Create bmw object
        System.out.println("-----BMW-----");
        Car bmw = new Car();

        // Set and get bmw name
        bmw.setName("BMW");
        System.out.println(bmw.getName());

        // Set and get bmw top speed
        bmw.setTopSpeed(250);
        System.out.println(bmw.getTopSpeed());

        // Print overview of bmw
        bmw.printOverview();

        // Increase bmw speed and print overview
        bmw.increaseSpeed(50);
        bmw.printCurrentSpeed();


        // Create ferrari object
        System.out.println("-----Ferrari-----");
        Car ferrari = new Car();

        // Set ferrari name and top speed and print overview
        ferrari.setName("Ferrari");
        ferrari.setTopSpeed(300);
        ferrari.printOverview();

        // Increase ferrari speed exceeding the top speed and print overview
        ferrari.increaseSpeed(325);
        ferrari.printCurrentSpeed();

        // Increase ferrari speed with a negative number and print overview
        ferrari.increaseSpeed(-10);
        ferrari.printCurrentSpeed();

    }

}
