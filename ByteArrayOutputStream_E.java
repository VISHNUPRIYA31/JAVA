import java.io.*;

class ByteArrayOutputStream_E {
  public static void main(String[] args) throws IOException {
    try {
      FileOutputStream f = new FileOutputStream("Byteoutput.txt");

      String s = "Generative AI --> Prompt Engineering";

      ByteArrayOutputStream b1 = new ByteArrayOutputStream();

      b1.write(s.getBytes());
      b1.writeTo(f);

      b1.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
