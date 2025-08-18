
class area
{
 Double width, height, depth;
 area (double width, double height, double depth)
 {
  this.width = width;
  this.height = height;
  this.depth = depth;
 }
}
public class this_cal {
    
public static void main(String[] args) {
	 area d = new area(10,20,30);
	 System.out.println("width = "+d.width);
	 System.out.println("height = "+d.height);
	 System.out.println("depth = "+d.depth);
 }
}