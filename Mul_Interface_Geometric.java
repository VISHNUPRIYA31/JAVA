/*interface Shape {
  void display();
}
interface Polygon {
  void getArea(int length, int breadth);
}
class Rectangle implements Polygon, Shape {

  public void getArea(int length, int breadth) {
    System.out.println("The area of the rectangle is " + (length * breadth));
  }
  public void display() {
    System.out.println("This is a Rectangle.");
  }
}
class Triangle implements Polygon, Shape {
  public void getArea(int base, int height) {
    System.out.println("The area of the triangle is " + (0.5 * base * height));
  }
  public void display() {
    System.out.println("This is a Triangle.");
  }
}
class Mul_Interface_Geometric {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.display(); 
    r1.getArea(5, 6);
    Triangle t1 = new Triangle();
    t1.display();
    t1.getArea(5, 6);
  }
}
*/
interface Shape {
    void display();
}
interface Polygon extends Shape {
    void getArea(int length, int breadth);
}
class Rectangle implements Polygon {
    public void display() {
        System.out.println("This is a Rectangle.");
    }

    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }
}
public class Mul_Interface_Geometric {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.display();           
        r1.getArea(5, 6);       
    }
}

