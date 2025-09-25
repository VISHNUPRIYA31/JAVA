class BookingException extends Exception {
    public BookingException(String message) {
        super(message);
    }
}
public class BookingChainedException {
    public static void main(String[] args) {
        try {
            try {
                throw new RuntimeException("Selected seat already booked");
            } catch (RuntimeException e) {
                BookingException be = new BookingException("Ticket booking failed");
                be.initCause(e);
                throw be;
            }
        } catch (BookingException ex) {
            System.out.println("Caught Exception: " + ex);
            System.out.println("Actual Cause: " + ex.getCause());
        }
    }
}
