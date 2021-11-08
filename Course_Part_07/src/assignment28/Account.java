package assignment28;

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


}
