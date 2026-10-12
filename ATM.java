
import java.util.Scanner;

class ATM {
    private int pin;
    private double balance;
    private final double min = 500;

    ATM(int pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        if (pin >= 1000 && pin <= 9999)
            this.pin = pin;
        else
            System.out.println("Invalid PIN");
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amt;
        System.out.println("Deposited: " + amt);
        alert();
    }

    public void withdraw(double amt) {
        if (amt <= 0)
            System.out.println("Invalid amount");
        else if (amt > balance)
            System.out.println("Insufficient balance");
        else {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
            alert();
        }
    }

    private void alert() {
        System.out.println("Balance: " + balance);
        if (balance < min)
            System.out.println("ALERT: Low balance!");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM a = new ATM(1234, 5000);

        System.out.print("Enter PIN: ");
        if (sc.nextInt() != a.getPin()) {
            System.out.println("Wrong PIN");
            sc.close();
            return;
        }

        int ch;
        do {
            System.out.println("\n1.Deposit  2.Withdraw  3.Balance  4.Change PIN  5.Exit");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Amount: ");
                    a.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Amount: ");
                    a.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Balance: " + a.getBalance());
                    break;
                case 4:
                    System.out.print("New PIN: ");
                    a.setPin(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 5);

        sc.close();
    }
}

