import java.io.FileWriter;
import java.io.Writer;

public class Writer_E {

    public static void main(String args[]) {

        String data = "Reader and Writer are the abstract class";

        try {
            Writer output = new FileWriter("output.txt");
            output.write(data);
            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

