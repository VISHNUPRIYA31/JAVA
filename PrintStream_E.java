import java.io.PrintStream;

class PrintStream_E {
    public static void main(String[] args) {

        String data = "Person Details";

        try {
            PrintStream output = new PrintStream("printstream_output.txt");
            String name = "Vishnu";
            int age = 25;
            output.print(data);
            output.printf("\n Name --> %s , Age --> %d", name, age);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
