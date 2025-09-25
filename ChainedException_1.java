public class ChainedException_1 {
    public static void main(String[] args) {
        try {
            RuntimeException ex = new RuntimeException("====> Transaction Failed");
            ex.initCause(new NullPointerException("====> Cash dispenser not working"));
            throw ex;

        } catch (RuntimeException e) {
            System.out.println(e);            // top-level exception
            System.out.println(e.getCause()); // actual root cause
        }
    }
}

/*
 public class ChainedException_1 {
    public static void main(String[] args) {
        try {
            // High-level exception (shown to user)
            RuntimeException paymentEx = new RuntimeException("====> Payment Failed");

            // Actual cause (technical issue during payment)
            paymentEx.initCause(new IllegalStateException("====> Bank server timeout"));

            // Throw the high-level exception
            throw paymentEx;

        } catch (RuntimeException e) {
            System.out.println(e);            // top-level exception
            System.out.println(e.getCause()); // actual root cause
        }
    }
}
 */
