class static_p {
    static int a=20; //static variable
    int b;
    int multiply(int a, int b){
        return a * b;
    }
    static int add(int a, int b){ //static method
        return a + b;
    }
   public static void main( String[] args ) {   
        static_p st = new static_p();
        System.out.println(static_p.a);
        static_p.a = 10;
        System.out.println(static_p.a);
        // call the nonstatic method
        System.out.println(" 2 * 2 = " + st.multiply(2,2));
        // call the static method
        System.out.println(" 2 + 3 = " + static_p.add(2,3));
   }
}