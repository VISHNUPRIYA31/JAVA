public class emp_constructor {
    String name ;
    int age;
    String dept="IT";
   emp_constructor() //no_arg constructor
    {
        name = "Kiran";
        age = 23;
    }
    emp_constructor(String n,int a) //parameterized constructor
    {
        name = n;
        age = a;
    }
    public static void main(String[] args) {
        emp_constructor ec = new emp_constructor();
        emp_constructor ec1 = new emp_constructor("Vijay",45);
        System.out.println(ec.name);
        System.out.println(ec.age);
        System.out.println(ec1.name);
        System.out.println(ec1.age);
    }
    
}
