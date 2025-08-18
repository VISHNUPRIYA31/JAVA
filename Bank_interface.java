interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
}
interface LoanServices {
    void applyLoan(double amount);
}
class Customer implements BankOperations, LoanServices {
    private double balance = 5000; 
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs." + amount);
        System.out.println("Updated Balance: Rs." + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
        System.out.println("Updated Balance: Rs." + balance);
    }
    public void applyLoan(double amount) {
        System.out.println("Loan of Rs." + amount + " has been applied successfully.");
    }
}
public class Bank_interface {
    public static void main(String[] args) {
        Customer c1 = new Customer();

        c1.deposit(2000);
        c1.withdraw(1000);
        c1.applyLoan(50000);
    }
}


