// ATMInterface.java
import java.util.Scanner;

// Class representing the user's bank account
class UserAccount {
    private double balance;

    public UserAccount(double startingBalance) {
        balance = startingBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void addFunds(double depositAmount) {
        balance += depositAmount;
    }

    public boolean takeFunds(double withdrawAmount) {
        if (withdrawAmount > balance) {
            return false;
        }
        balance -= withdrawAmount;
        return true;
    }
}

// Class representing the ATM functionality
public class ATMInterface {
    private UserAccount clientAccount;
    private Scanner scanner;

    public ATMInterface(UserAccount account) {
        this.clientAccount = account;
        scanner = new Scanner(System.in);
    }

    public void startATM() {
        System.out.println("Welcome to the ATM Service");
        int option;

        do {
            System.out.println("\nPlease choose an operation:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    showBalance();
                    break;
                case 2:
                    depositToAccount();
                    break;
                case 3:
                    withdrawFromAccount();
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid input. Please choose between 1 and 4.");
            }
        } while (option != 4);
    }

    private void showBalance() {
        System.out.printf("Your current balance is: ₹%.2f\n", clientAccount.getBalance());
    }

    private void depositToAccount() {
        System.out.print("Enter amount to deposit: ₹");
        double deposit = scanner.nextDouble();

        if (deposit <= 0) {
            System.out.println("Invalid deposit amount. Please enter a positive number.");
        } else {
            clientAccount.addFunds(deposit);
            System.out.println("Amount successfully deposited.");
        }
    }

    private void withdrawFromAccount() {
        System.out.print("Enter amount to withdraw: ₹");
        double withdrawal = scanner.nextDouble();

        if (withdrawal <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive number.");
        } else if (clientAccount.takeFunds(withdrawal)) {
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient balance. Transaction failed.");
        }
    }

    public static void main(String[] args) {
        UserAccount user = new UserAccount(1000.00); // Initial balance ₹1000
        ATMInterface atmSession = new ATMInterface(user);
        atmSession.startATM();
    }
}