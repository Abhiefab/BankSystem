package Assessment.BankSystem;

import java.util.ArrayList;

public class BankManager {

    public static void main(String[] args) {

        BankAccount savings = new SavingsAccount("12345", "Avinash Singh", 0.02);
        BankAccount checking = new CheckingAccount("67890", "Avinash Singh", 500);

        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(savings);
        accounts.add(checking);

        savings.deposit(200);
        checking.withdraw(100);

        System.out.println("\n--- Account Details Before Interest ---");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountDetails());
        }

        if (savings instanceof SavingsAccount) {
            ((SavingsAccount) savings).applyInterest();
        }

        System.out.println("\n--- Account Details After Interest ---");
        for (BankAccount acc : accounts) {
            System.out.println(acc.getAccountDetails());
        }
    }
}
