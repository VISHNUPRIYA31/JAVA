import java.io.*;
class FileOutputStream_E {

  public static void main(String[] args) throws IOException {
    try {
      FileInputStream f = new FileInputStream("dataout.txt");

      int x = 0;
      
      while ((x = f.read()) != -1) {
        System.out.print((char) x);
      }
      
      f.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
