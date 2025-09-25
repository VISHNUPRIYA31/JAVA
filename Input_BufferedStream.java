import java.io.*;
class Input_BufferedStream {
  public static void main(String[] args) throws IOException {
    try {
      FileInputStream f1 = new FileInputStream("data.txt");
      BufferedInputStream f2 = new BufferedInputStream(f1);

      System.out.println("Available bytes: " + f2.available());

      int x = 0;

      while ((x = f2.read()) != -1) {
        System.out.print((char) x);
      }
      System.out.println("Available bytes: " + f2.available());
      System.out.println();
      f2.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

