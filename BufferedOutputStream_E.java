import java.io.*;

class BufferedOutputStream_E {
  public static void main(String[] args) throws IOException {
    try {
      FileOutputStream f1 = new FileOutputStream("bufferoutput.txt");

      BufferedOutputStream f2 = new BufferedOutputStream(f1);

      String s = "LLM - Large Language Models";
      char arr[] = s.toCharArray();
      int x = 0;
      while (x < s.length()) {
        f2.write(arr[x++]);
      }
      f2.close();
      f1.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

