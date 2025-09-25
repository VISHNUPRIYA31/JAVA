public class cmd_line_args {
    //command line arguments
    public static void main(String[] args){
        System.out.println(args[0]);
        System.out.println(args[1]);
        int a1 = Integer.parseInt(args[0]);
        double d = Double.parseDouble(args[1]);
        System.out.println(a1+d);
    }
}
