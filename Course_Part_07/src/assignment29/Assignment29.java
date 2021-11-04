package assignment29;

public class Assignment29 {
    public static void main(String[] args) {

        SavingsAccount raboSpaarrekening = new SavingsAccount();
        raboSpaarrekening.balance = 5000;
        raboSpaarrekening.printOverview(); //output: Overview: name = SavingsAccount, balance = 5000
        raboSpaarrekening.withdraw(30000);
        raboSpaarrekening.printOverview(); //output before withdraw() override: Overview: name = SavingsAccount, balance = -25000

        SavingsAccount abnSpaarrekening = new SavingsAccount();
        abnSpaarrekening.balance = 1000;
        abnSpaarrekening.withdraw(2000);
        abnSpaarrekening.printOverview();

    }
}
