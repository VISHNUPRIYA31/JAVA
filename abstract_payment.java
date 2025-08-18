abstract class Payment {
    double amount;
    Payment(double amount) {
        this.amount = amount;
    }
    public void showAmount() {
        System.out.println("Amount to be paid: ₹" + amount);
    }
    public abstract void makePayment();
}
class UpiPayment extends Payment {
    String upiId;

    UpiPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }
    public void makePayment() {
        System.out.println("Processing UPI payment for UPI ID: " + upiId);
        System.out.println("UPI payment of " + amount + " successful.");
    }
}
public class abstract_payment {
    public static void main(String[] args) {
    
        UpiPayment upi = new UpiPayment(750.00, "user@upi");
        upi.showAmount();
        upi.makePayment();
    }
}
