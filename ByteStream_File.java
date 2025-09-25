import java.io.*;   
public class ByteStream_File
{
    public static void main(String[] args) throws IOException
    {  
        FileInputStream ss = null; //declared out of try to close the file in
        FileOutputStream ts = null;
        try 
        {
            ss = new FileInputStream("bird.webp");
            ts = new FileOutputStream ("bird_c.jpg");
            int temp;
            while ((temp = ss.read()) != -1)
            {
                //char ch = (char) temp; // convert byte to character
                System.out.print(temp + " ");  // print without extra newline
                ts.write(temp);            
            }
        }
        finally 
        {
            ss.close();   
            ts.close(); 
        }
    }
}


/*
import java.io.*;   

public class ByteStream_File {
    public static void main(String[] args) {
        try (FileInputStream ss = new FileInputStream("data.txt");
             FileOutputStream ts = new FileOutputStream("dataout.txt")) 
             //try with-a-resource
            {

            int temp;
            while ((temp = ss.read()) != -1) {
                System.out.print((char) temp); // print char
                ts.write(temp);                // copy byte to output file
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 */