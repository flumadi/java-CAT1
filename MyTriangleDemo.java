public class MyTriangleDemo {
    public static void main(String[] args) {
        // Test constructor with coordinates
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 3, 4);
        System.out.println("Triangle 1:");
        System.out.println(triangle1);  // Should print MyTriangle[v1=(0, 0), v2=(3, 0), v3=(3, 4)]
        
        // Test constructor with MyPoint instances
        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(1, 1);
        MyPoint point3 = new MyPoint(1, 0);
        MyTriangle triangle2 = new MyTriangle(point1, point2, point3);
        System.out.println("Triangle 2:");
        System.out.println(triangle2);  // Should print MyTriangle[v1=(0, 0), v2=(1, 1), v3=(1, 0)]
        
        // Test getPerimeter method
        System.out.println("Perimeter of Triangle 1: " + triangle1.getPerimeter());  // Should print the perimeter of triangle1
        System.out.println("Perimeter of Triangle 2: " + triangle2.getPerimeter());  // Should print the perimeter of triangle2

        // Test printType method
        System.out.print("Type of Triangle 1: ");
        triangle1.printType();  // Should print the type of triangle1

        System.out.print("Type of Triangle 2: ");
        triangle2.printType();  // Should print the type of triangle2
    }
}