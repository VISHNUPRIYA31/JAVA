import java.io.*;

class BufferedReader_E {
  public static void main(String[] args) {

    char[] array = new char[100];

    try {
      FileReader file = new FileReader("data.txt");
      BufferedReader input = new BufferedReader(file);
      //input.skip(5);
      input.read(array);
      System.out.println("Data in the file: ");
      System.out.println(array);
      input.close();

      FileWriter file1 = new FileWriter("data_output_BR.txt");
      BufferedWriter output = new BufferedWriter(file1);
      String s = "The BufferedWriter maintains an internal buffer of 8192 characters.";
      output.write(s);
      output.flush();
      System.out.println("Data is flushed to the file.");
      output.close();

    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}