package assignment28;

public class Assignment28 {
    public static void main(String[] args) {

        CheckingAccount myCheckingAccount = new CheckingAccount(5000);
        myCheckingAccount.name = "myCheckingAccount";
        myCheckingAccount.printOverview();

        // output
        // Overview: name = myCheckingAccount, balance = 5000
    }
}
