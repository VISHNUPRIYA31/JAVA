import java.io.*;

class File_throws {

    void readFile() throws IOException {
        FileReader fr = new FileReader("data1.txt"); 
        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine(); 
        System.out.println("First line: " + line);

        br.close();
    }
    public static void main(String[] args) {
        File_throws ft = new File_throws();
        try {
            ft.readFile(); 
        } catch (IOException e) {
            System.out.println("Exception handled: " + e);
        }

        System.out.println("Program continues...");
    }
}
