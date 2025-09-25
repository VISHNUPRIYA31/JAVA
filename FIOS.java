import java.io.FileInputStream;
import java.io.InputStream;

class FIOS {
  public static void main(String args[]) {

    //datatype[] variable_name = new datatype[size_of_array];

    byte[] array = new byte[100];

    try {
      InputStream input = new FileInputStream("data.txt");

      System.out.println("Available bytes in the file: " + input.available());
      //read(byte[] a)
      input.read(array);
      System.out.println("Data read from the file: ");

      
      String data = new String(array);
      System.out.println(data);

      input.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}