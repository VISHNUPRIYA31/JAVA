interface BankAccount_1 {
    void deposit(double amount);
    void withdraw(double amount);
}

interface LoanAccount_1 {
    void applyLoan(double amount);
}

interface Insurance_1 {
    void applyInsurance(String type);
}

interface PremiumCustomer_1 extends BankAccount_1, LoanAccount_1, Insurance_1 {
    void getCustomerBenefits();
}

class Customer_1 implements PremiumCustomer_1 {
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
        System.out.println("Loan of Rs." + amount + " applied successfully.");
    }

    public void applyInsurance(String type) {
        System.out.println(type + " Insurance applied successfully.");
    }

    public void getCustomerBenefits() {
        System.out.println("Premium customer benefits: Cashback, Low Interest Loans, Free Insurance.");
    }
}
public class Bank_interface_1 {
    public static void main(String[] args) {
        Customer_1 c1 = new Customer_1();
        c1.deposit(2000);
        c1.withdraw(1000);
        c1.applyLoan(50000);
        c1.applyInsurance("Health");
        c1.getCustomerBenefits();
    }
}