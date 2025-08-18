interface Polygon {
  void getArea(int length, int breadth);
}

class Rectangle implements Polygon {  

  public void getArea(int length, int breadth) {
    System.out.println("The area of the rectangle is " + (length * breadth));
  }
}

class Triangle implements Polygon {

  public void getArea(int base, int height) {
    System.out.println("The area of the triangle is " + (0.5 * base * height));
  }
}

class interface_geometric {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    r1.getArea(5, 6);
    Triangle t1 = new Triangle();
    t1.getArea(5, 6);
  }
  
}

