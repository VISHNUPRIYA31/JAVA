import java.io.*;
public class CharacterStream_E {

   public static void main(String args[]) throws IOException {
      FileReader in = null;
      FileWriter out = null;
      char[] array = new char[100];
      try {
         in = new FileReader("data.txt");
         out = new FileWriter("data_char.txt");
         
         in.read(array);
         System.out.println("Data in the file: ");
         System.out.println(array);
         in.close();

         String s = "Character Stream is used to read or write character to the file";
         out.write(s);

         out.close();


      }
       finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
