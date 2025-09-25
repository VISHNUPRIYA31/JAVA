import java.util.Scanner;

class  ATM_Exception{
    int balance = 50000;
    void withdraw(int amount) throws ArithmeticException{
        if (amount > balance) {
            throw new ArithmeticException("Insufficient balance for withdrawal!");
        } else {
            System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
        }
    }
    public static void main(String[] args) {
        ATM_Exception atm = new ATM_Exception();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the amount to be withdrawn : ");
        int amount = s.nextInt();
        try {
            atm.withdraw(amount); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Transaction complete.");
    }
}


