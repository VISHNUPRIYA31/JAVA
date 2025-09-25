import java.io.*;
class BankAccount implements Serializable {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
public class ObjectStream_Bank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("AC12345", 25000.75);

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.ser"));
            oos.writeObject(acc1);
            oos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.ser"));
            BankAccount savedAcc = (BankAccount) ois.readObject();
            ois.close();

            System.out.println("Account Number: " + savedAcc.accountNumber);
            System.out.println("Balance: " + savedAcc.balance);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
