import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        int pin_no = 3115;
        Scanner sc = new Scanner(System.in);
        sample o = new sample();
        System.out.println("Enter Your pin");
        int pin = sc.nextInt();
        if (pin_no == pin) {
            int choice;
            do {
                System.out.println("\n1. Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Enter your choice (1/2/3/4): ");
                choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Balance: " + o.getbalance());
                } 
                else if (choice == 2) {
                    System.out.print("Enter your amount: ");
                    double amt = sc.nextDouble();
                    o.deposit(amt);
                    System.out.println("Amount deposited successfully!");
                } 
                else if (choice == 3) {
                    System.out.println("Enter amount to Withdraw");
                    double rupee = sc.nextDouble();
                    o.withdraw(rupee);
                } 
                else if (choice == 4) {
                    System.out.println("Exiting... Thank you!");
                } 
                else {
                    System.out.println("Invalid Choice");
                }

            } while (choice != 4);

        } else {
            System.out.println("Incorrect pin");
        }
    }
}

class sample {
    private double balance = 3000;
    double getbalance() {
        return balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double rupee){
        balance -= rupee;
    }
}