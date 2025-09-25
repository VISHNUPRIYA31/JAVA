import java.io.*;
class Input_ByteArrayInputStream {
  public static void main(String[] args) throws IOException {
    try {
      FileInputStream f1 = new FileInputStream("data.txt");

      int x = 0;
      String S = "";
      while ((x = f1.read()) != -1) {
        S = S + (char) x;
      }
      f1.close();

      byte[] b = S.getBytes();
      ByteArrayInputStream b1 = new ByteArrayInputStream(b);

      x = b1.read();
      while (x != -1) {
        System.out.print((char) x);
        x = b1.read();
      }
      System.out.println();
      b1.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}


