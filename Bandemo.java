public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        BankAccount b = new BankAccount(balance);

        System.out.print("Enter deposit amount: ");
        int deposit = sc.nextInt();
        b.deposit(deposit);

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        try {
            b.withdraw(withdraw);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}