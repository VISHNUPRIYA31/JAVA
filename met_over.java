public class met_over {
    int add(int x,int y){
        return x+y;
    }
    int add(int x,int y, int z){
        return x+y+z;
    }
    double add(double x,double y){
        return x+y;
    }

    public static void main(String [] aa)
    {
        met_over mo = new met_over();
       int r = mo.add(5,6);
       int r1 = mo.add(5,6,7);
       double dr = mo.add(4.7, 5.87);
       System.out.println(r); //
       System.out.println(r1);
       System.out.println(dr);
    }
}
