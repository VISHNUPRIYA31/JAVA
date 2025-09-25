import java.util.*;
class InvalidMarksException extends RuntimeException {
    public InvalidMarksException(String message) {
        super(message);
    }
}
class Student {
    private String name;
    private int marks;
    //Unchecked Exception
    public Student(String name, int marks) {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid Marks! Marks should be between 0 and 100.");
        }
        this.name = name;
        this.marks = marks;
    }

    public void displayResult() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        if (marks >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}

public class Custom_Exception_Student1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try {
            Student student = new Student(name, marks);
            student.displayResult();
        } catch (InvalidMarksException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Student Result Process Completed.");
    }
}
