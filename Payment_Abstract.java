import java.util.*;
abstract class Payment {
    int transactionId;
    double amount;
    static double ac_balance = 50000;
    public Payment(int transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }
    // Concrete method
    public void authenticateUser() {
        System.out.println("User authenticated successfully!");
    }
    public void balance(){
        System.out.println("Balance = Rs. " + ac_balance);
    }
    // Abstract method - implemented by subclasses
    abstract void processPayment();
}
class CreditCardPayment extends Payment {
    long cardNumber;
    public CreditCardPayment(int transactionId, double amount, long cardNumber) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }
    void processPayment() {
        System.out.println("Processing Credit Card payment of Rs. " + amount +" with card number: " + cardNumber);
        ac_balance = ac_balance - amount;
    }
}
class UpiPayment extends Payment {
    String upiId;
    public UpiPayment(int transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }
    void processPayment() {
        System.out.println("Processing UPI payment of Rs. " + amount +" using UPI ID: " + upiId);
        ac_balance = ac_balance - amount;
    }
}
public class Payment_Abstract {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Transaction ID");
        int p = s.nextInt();
        System.out.println("Enter Amount");
        double a = s.nextDouble();
        System.out.println("1. CardPayment\t2.UPIPayment");
        int ch = s.nextInt();
        if (ch == 1)
        {
            System.out.println("Enter card Number ");
            long cc = s.nextLong();
            CreditCardPayment p1 = new CreditCardPayment(p,a,cc);
            p1.authenticateUser();
            p1.processPayment();
            p1.balance();
        }
        else
        {
            System.out.println("Enter UPI Number ");
            s.nextLine();
            String upi = s.nextLine();
            UpiPayment p2 = new UpiPayment(p,a,upi);
            p2.authenticateUser();
            p2.processPayment();
            p2.balance();
        }
        
    }
}
