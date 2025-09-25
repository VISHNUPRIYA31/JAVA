
public class StackTraceExample {
	    public static void main(String[] args) {
	       demo();
	    }

	    static void demo() {
	       demo1();
	    } 

	    static void demo1() {
	        demo2();
	    }

	    static void demo2() {
	        demo3();
	    }

	    static void demo3() {
	        Thread.dumpStack();
	    }
	}

/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StackTraceExample {

    public static void main(String[] args) {
        System.out.println("Starting File Read Process...");
        readFile();
    }

    static void readFile() {
        processFile();
    }

    static void processFile() {
        openFile();
    }

    static void openFile() {
        try {
            File file = new File("non_existing_file.txt");
            Scanner sc = new Scanner(file); // this will throw FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("Exception occurred: " + e);
            e.printStackTrace();  // prints the stack trace
        }
    }
}
*/
