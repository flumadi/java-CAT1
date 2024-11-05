public class MyCircleDemo {
    public static void main(String[] args) {
        // Test default constructor
        MyCircle circle1 = new MyCircle();
        System.out.println("Default Constructor:");
        System.out.println(circle1);  // Should print MyCircle[radius=1, center=(0, 0)]

        // Test constructor with center's (x, y) and radius
        MyCircle circle2 = new MyCircle(3, 4, 5);
        System.out.println("Constructor with center's (x, y) and radius:");
        System.out.println(circle2);  // Should print MyCircle[radius=5, center=(3, 4)]

        // Test constructor with MyPoint instance as center and radius
        MyCircle circle3 = new MyCircle(new MyPoint(6, 7), 8);
        System.out.println("Constructor with MyPoint instance as center and radius:");
        System.out.println(circle3);  // Should print MyCircle[radius=8, center=(6, 7)]

        // Test getters and setters
        circle1.setCenter(new MyPoint(1, 2));
        circle1.setRadius(10);
        System.out.println("Updated Circle 1:");
        System.out.println(circle1);  // Should print MyCircle[radius=10, center=(1, 2)]

        // Test getArea and getCircumference methods
        System.out.println("Area of Circle 1: " + circle1.getArea());  // Should print 314.1592653589793
        System.out.println("Circumference of Circle 1: " + circle1.getCircumference());  // Should print 62.83185307179586

        // Test distance method
        System.out.println("Distance between Circle 1 and Circle 2: " + circle1.distance(circle2));  // Should print the distance
    }
}