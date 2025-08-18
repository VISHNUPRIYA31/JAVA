class Employee {
    String name;
    int id;
    public Employee(String n, int i) {
        name = n; 
        id = i;   
    }
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
    public FullTimeEmployee(String n, int i, double s) {
        super(n, i); // Call parent constructor
        monthlySalary = s;
    }

    public void calculatePay() {
        System.out.println("Monthly Salary: $" + monthlySalary);
    }
}
class Manager extends FullTimeEmployee {
    String department;

    public Manager(String n, int i, double s) {
        super(n, i, s); // Call FullTimeEmployee constructor
        department = "Deputy Manager - Software Development";
    }
    public void d_displayEmployeeDetails() {
        super.displayEmployeeDetails();     // Using super function
        // Using super function
        // Using super variable
        System.out.println("Bonus + Salary = $" + (super.monthlySalary + 500.00));
        System.out.println("Department: " + department);
    }
}
class PartTimeEmployee extends Employee {
    double hoursrate;
    double hoursworked;
    
    public PartTimeEmployee(String n, int i, double hr, double hw) {
        super(n, i); // Call parent constructor
        hoursrate = hr;
        hoursworked = hw;
    }
    
    public void calculatePay() {
        super.displayEmployeeDetails();
        System.out.println("Monthly Salary: $" + (hoursrate * hoursworked));
    }
}
public class PayrollSystem_2 {
    public static void main(String[] args) {

        Manager emp1 = new Manager("John", 101, 3000);
        emp1.d_displayEmployeeDetails();
        System.out.println();

        PartTimeEmployee emp2 = new PartTimeEmployee("Logesh", 102, 20, 18);
        emp2.calculatePay();
    }
}
