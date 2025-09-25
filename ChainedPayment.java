class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}
public class ChainedPayment {
    public static void main(String[] args) {
        try {
            try {
                throw new RuntimeException("Bank server timeout");
            } catch (RuntimeException e) {
                PaymentFailedException pfe = new PaymentFailedException("Payment could not be processed");
                pfe.initCause(e);  // chaining actual cause
                throw pfe;
            }
        } catch (PaymentFailedException ex) {
            System.out.println("Caught Exception: " + ex);
            System.out.println("Actual Cause: " + ex.getCause());
            ex.printStackTrace();
        }
    }
}
