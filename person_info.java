 class person {//parent or super or base class
    String name;
    int age;
    void info(){
        System.out.println(name);
        System.out.println(age);
    }
}
class programmer extends person{ //child or sub or derived class 
    String com_name;
    void c_info(){
        System.out.println(com_name);
    }
}
public class person_info{
    public static void main(String[] aa){
        programmer p = new programmer();
        p.name = "Vicky";
        p.age = 21;
        p.com_name = "TCS";
        p.info();
        p.c_info();
    }
}

