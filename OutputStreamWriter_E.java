import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_E  {

  public static void main(String args[]) {

    String data = "This is a line of text inside the file.";

    try {
      FileOutputStream file = new FileOutputStream("output.txt");

      OutputStreamWriter output = new OutputStreamWriter(file);

      output.write(data);

      output.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}