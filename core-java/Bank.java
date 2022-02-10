import java.util.Scanner;

class Account {
    String accountHolders;
    double balance = 1000;

    void debit(int amount) {
        if (amount <= balance) {
            System.out.println("Amount debited " + amount);
            balance = balance - amount;
            showbalance();
        } else {
            System.out.println("Debit amount exceeded account balance");
        }
    }

    void credit(int amount) {
        balance = balance + amount;
        showbalance();

    }

    void showbalance() {
        System.out.println("Account Name " + accountHolders);
        System.out.println("Current balance " + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account ac = new Account();
        System.out.println("Enter your account name");
        ac.accountHolders = scanner.next();
        int choice;
        do {
            System.out.println("Welcome to bank Select operation u wanna perform 1. deposit 2. withdraw 3.showbalance");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to be deposited");
                    ac.credit(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter amount to be withdrawn");
                    ac.debit(scanner.nextInt());
                    break;
                case 3:
                    ac.showbalance();
                    break;
                default:
                    break;
            }
            System.out.println("press 1 to continue 0 to exit");
            choice = scanner.nextInt();
        } while (choice != 0);
        scanner.close();
    }
}
