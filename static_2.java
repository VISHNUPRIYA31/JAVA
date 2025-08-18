class static_2 {
   static int a = 23;
   static int b;
   static int max;
   static {
       System.out.println("First Static block.");
       b = a * 4;
   }
   static {
       System.out.println("Second Static block.");
       max = 30;
   }
   static void display() {

       System.out.println("a = " + a);
       System.out.println("b = " + b);
       System.out.println("max = " + max);
   }
   public static void main(String args[]) {
        Innerstatic_2 in = new Innerstatic_2();
        System.out.println(Innerstatic_2.d);
        System.out.println(in.g);
       display();
   }
}
class Innerstatic_2 {
static int d = 10;
    int g =9;
}