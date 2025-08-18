class Employee {
    String name;
    int id;
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
    public FullTimeEmployee(String n, int i, double s) {
        name = n; //parent class variable
        id = i;   //parent class variable
        monthlySalary = s;
    }
    public void calculatePay() {
        System.out.println("Monthly Salary: $" + monthlySalary);
    }
}
class Manager extends FullTimeEmployee{
    String department;
    Manager(String n, int i, double s){
        super(n, i, s);
        department = "Deputy Manager - Software Development";
    }
    public void d_displayEmployeeDetails() {
        System.out.println("Department: "+department);
    }

}
class PartTimeEmployee extends Employee {
    double hoursrate;
    double hoursworked;
    public PartTimeEmployee(String n, int i, double hr, double hw) {
        name = n; //parent class variable
        id = i;   //parent class variable
        hoursrate = hr;
        hoursworked = hw;
    }
    public void calculatePay() {
        System.out.println("Monthly Salary: $" + hoursrate*hoursworked);
    }
}
public class PayrollSystem_1 {
    public static void main(String[] args) {

        Manager emp1 = new Manager("John", 101, 3000);

        PartTimeEmployee emp2 = new PartTimeEmployee("Logesh", 102, 20, 18);

        emp1.displayEmployeeDetails();    //parent class method
        emp1.calculatePay();    //child class method
        emp1.d_displayEmployeeDetails();

        emp2.displayEmployeeDetails();;
        emp2.calculatePay();
    }
}
