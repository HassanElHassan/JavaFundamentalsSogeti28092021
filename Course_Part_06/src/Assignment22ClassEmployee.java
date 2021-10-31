public class Assignment22ClassEmployee {

    public static void main(String[] args) {

        Employee pieter = new Employee(1,"Pieter", "Post", 2500);
        pieter.printAnnualSalary();
        pieter.raiseSalary(15);
        pieter.printAnnualSalary();
        pieter.printOverview();

        Employee henry = new Employee(2, "Henry", "Henriksen", 1250);
        henry.raiseSalary(23);
        henry.printOverview();

    }

}
