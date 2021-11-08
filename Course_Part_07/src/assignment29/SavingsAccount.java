package assignment29;

import assignment27.Player;

public class SavingsAccount extends Account {

    int interest;

    public SavingsAccount() {
        this.name = "SavingsAccount";
        this.balance = 0;
        this.interest = 5;
    }

    public int getAnnualInterest(int balance, int interest) {
        return balance * (interest / 100);
    }

    @Override
    public void withdraw(int amount) {
        if (balance - amount < 0) {
            System.out.println("Amount too high!");
        } else {
            balance -= amount;
        }
    }

}
