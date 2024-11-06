public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    // Constructor with coordinates
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    // Overloaded constructor with MyPoint instances
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // toString method
    @Override
    public String toString() {
        return 
        "v1="  + v1 +"\n" + 
        "v2=" + v2 + "\n" + 
        "v3=" + v3;
    }

    // Method to calculate the perimeter
    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    // Method to print the type of triangle
    public void printType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);

        if (side1 == side2 && side2 == side3) {
            System.out.println("equilateral");
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            System.out.println("isosceles");
        } else {
            System.out.println("scalene");
        }
    }
}