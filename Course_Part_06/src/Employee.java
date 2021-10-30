public class Employee {

    int id;
    String firstName;
    String lastName;
    int salary;

    Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public void printAnnualSalary(){
        System.out.println("Annual salary is: " + this.getAnnualSalary());
    }

    public void raiseSalary(int percent){
        this.salary = this.salary * (percent+100) / 100;
    }

    public void printOverview(){
        System.out.printf(
                "Employee[id=%d, name=%s, salary=%d]%n",
                this.id,
                this.firstName + " " + this.lastName,
                this.salary
        );
    }

}
