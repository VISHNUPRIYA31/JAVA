import java.io.*;
class ObjectStream {
    public static void main(String[] args) {

        int data1 = 5;
        String data2 = "This is ObjectInputStream and ObjectOuputStream Classes";

        try {

            FileOutputStream file = new FileOutputStream("Object_out.txt");

            ObjectOutputStream out1 = new ObjectOutputStream(file);

            out1.writeInt(data1);
            out1.writeObject(data2);

            FileInputStream fs = new FileInputStream("Object_out.txt");
            ObjectInputStream os = new ObjectInputStream(fs);

            System.out.println("Integer data :" + os.readInt());
            System.out.println("String data: " + os.readObject());

            out1.close();
            os.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}