import java.io.InputStreamReader;
import java.io.FileInputStream;

class InputStreamReader_e {
  public static void main(String[] args) {

    char[] array = new char[100];

    try {
      FileInputStream file = new FileInputStream("data.txt");

      InputStreamReader input = new InputStreamReader(file);
      //InputStreamReader input = new InputStreamReader(file,Charset.forName("UTF8"));

      input.read(array);
      System.out.println("Data in the stream:");
      System.out.println(array);
      System.out.println("Character encoding of input1: " + input.getEncoding());

      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}