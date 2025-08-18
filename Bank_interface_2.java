
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

interface LoanAccount {
    void applyLoan(double amount, double interestRate, int years);
}

interface Insurance {
    void applyInsurance(String type, double premium);
}

interface PremiumCustomer extends BankAccount, LoanAccount, Insurance {
    void getCustomerBenefits(double purchaseAmount);
}

class Customer implements PremiumCustomer {
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

    public void applyLoan(double amount, double interestRate, int years) {
        double totalPayable = amount + (amount * interestRate * years / 100);
        System.out.println("Loan of Rs." + amount + " applied for " + years + " years at " 
                           + interestRate + "% interest.");
        System.out.println("Total Payable after " + years + " years: Rs." + totalPayable);
    }

    public void applyInsurance(String type, double premium) {
        if (premium <= balance) {
            balance -= premium;
            System.out.println(type + " Insurance applied. Premium Rs." + premium + " deducted.");
        } else {
            System.out.println("Not enough balance to pay insurance premium.");
        }
        System.out.println("Updated Balance: Rs." + balance);
    }

    public void getCustomerBenefits(double purchaseAmount) {
        double cashback = purchaseAmount * 0.05; 
        balance += cashback;
        System.out.println("Purchase Amount: Rs." + purchaseAmount);
        System.out.println("Cashback of Rs." + cashback + " credited.");
        System.out.println("Updated Balance: Rs." + balance);
    }
}

public class Bank_interface_2 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.deposit(2000);
        c1.withdraw(1000);
        c1.applyLoan(50000, 8.5, 5);   
        c1.applyInsurance("Health", 2000);
        c1.getCustomerBenefits(10000);
    }
}