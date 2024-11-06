public class MyPointDemo {
    public static void main(String[] args) {
        // Test default constructor
        MyPoint p1 = new MyPoint();
        System.out.println("Default Constructor:");
        System.out.println(p1);  // Should print (0, 0)
        
        // Test setters
        p1.setX(8);
        p1.setY(6);
        System.out.println("Setters:");
        System.out.println("x is: " + p1.getX());  // Should print 8
        System.out.println("y is: " + p1.getY());  // Should print 6
        
        // Test setXY
        p1.setXY(3, 0);
        System.out.println("setXY Method:");
        System.out.println("x is: " + p1.getXY()[0]);  // Should print 3
        System.out.println("y is: " + p1.getXY()[1]);  // Should print 0
        System.out.println(p1);  // Should print (3, 0)
        
        // Test overloaded constructor
        MyPoint p2 = new MyPoint(0, 4);
        System.out.println("Overloaded Constructor:");
        System.out.println(p2);  // Should print (0, 4)
        
        // Test distance methods
        System.out.println("Distance Methods:");
        System.out.println(p1.distance(p2));  // Distance from (3, 0) to (0, 4)
        System.out.println(p2.distance(p1));  // Distance from (0, 4) to (3, 0)
        System.out.println(p1.distance(5, 6));  // Distance from (3, 0) to (5, 6)
        System.out.println(p1.distance());  // Distance from (3, 0) to origin (0, 0)
    }
}