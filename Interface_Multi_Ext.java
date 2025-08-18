import java.util.Scanner;
interface Shape_1 {
    void display();
}

interface Polygon_1 {
    void getArea(int length, int breadth);
}

interface PerimeterPolygon_1 extends Shape_1, Polygon_1 {
    void getPerimeter(int length, int breadth);
}

class Rectangle_1 implements PerimeterPolygon_1 {
    public void getArea(int length, int breadth) {
        System.out.println("The area of the rectangle is " + (length * breadth));
    }

    public void display() {
        System.out.println("This is a Rectangle.");
    }

    public void getPerimeter(int length, int breadth) {
        System.out.println("The perimeter of the rectangle is " + (2 * (length + breadth)));
    }
}

class Triangle_1 implements PerimeterPolygon_1 {
    public void getArea(int base, int height) {
        System.out.println("The area of the triangle is " + (0.5 * base * height));
    }

    public void display() {
        System.out.println("This is a Triangle.");
    }

    public void getPerimeter(int a, int b) {
        // For simplicity, assume equilateral triangle with sides 'a' and 'b' treated same
        int c = a; 
        System.out.println("The perimeter of the triangle is " + (a + b + c));
    }
}

class Interface_Multi_Ext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape: 1. Rectangle  2. Triangle");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Enter length and breadth:");
            int l = sc.nextInt();
            int b = sc.nextInt();
            Rectangle_1 r = new Rectangle_1();
            r.display();
            r.getArea(l, b);
            r.getPerimeter(l, b);

        } else if (choice == 2) {
            System.out.println("Enter base and height:");
            int base = sc.nextInt();
            int h = sc.nextInt();
            Triangle_1 t = new Triangle_1();
            t.display();
            t.getArea(base, h);
            t.getPerimeter(base, h);

        } else {
            System.out.println("Invalid choice!");
        }
    }
}
