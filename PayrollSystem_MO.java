class Employee {
    String name;
    int id;
    Employee(String n, int i){
        name = n;
        id = i;
    }
    protected void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
    public FullTimeEmployee(String n, int i, double s) {
        super(n,i);
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
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Department: "+department);
    }
}
public class PayrollSystem_MO {
    public static void main(String[] args) {
        Manager emp1 = new Manager("John", 101, 3000);   
        emp1.displayEmployeeDetails();   
        emp1.calculatePay();  
}
}



