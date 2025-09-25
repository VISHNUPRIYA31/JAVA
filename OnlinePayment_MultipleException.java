import java.util.Scanner;

class InvalidCardException extends Exception {
    public InvalidCardException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class PaymentGateway {
    private double balance = 150000.0;

    public void makePayment(String cardNumber, double amount) 
            throws InvalidCardException, InsufficientBalanceException {
 
        if (cardNumber.length() != 16) {
            throw new InvalidCardException("Invalid Card! Card number must be 16 digits.");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Transaction failed! Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Payment of Rs." + amount + " successful.");
        System.out.println("Remaining Balance: Rs." + balance);
    }
}
public class OnlinePayment_MultipleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentGateway gateway = new PaymentGateway();

        System.out.print("Enter card number: ");
        String card = sc.nextLine();

        System.out.print("Enter payment amount: ");
        double amount = sc.nextDouble();

        try {
            gateway.makePayment(card, amount);
        } catch (InvalidCardException | InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Transaction Process Completed.");
    }
}
