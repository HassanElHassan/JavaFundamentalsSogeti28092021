package assignment29;

public class Account {

    // default access modifier used, best option as is needed only in the package
    // Protected and Public can also be used
    String name;
    int balance;

    public void printOverview() {
        System.out.printf("Overview: name = %s, balance = %d%n",
                name,
                balance);
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

}
