public class DuckingException {

    public void ccc(){
        try{
            cc();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public void cc() throws ClassNotFoundException{
       Class.forName("Demo1");
    }
    public static void main (String[] a){
        DuckingException de = new DuckingException();
        de.ccc();
    }
}
