public class MyLineDemo {
    public static void main(String[] args) {
        // Test constructors
        MyLine line1 = new MyLine(new MyPoint(1, 1), new MyPoint(2, 2));
        System.out.println("Line 1:");
        System.out.println(line1);  // Should print MyLine[begin=(1, 1), end=(2, 2)]

        MyLine line2 = new MyLine(3, 4, 5, 6);
        System.out.println("Line 2:");
        System.out.println(line2);  // Should print MyLine[begin=(3, 4), end=(5, 6)]

        // Test getters and setters
        line1.setBegin(new MyPoint(0, 0));
        line1.setEnd(new MyPoint(3, 4));
        System.out.println("Updated Line 1:");
        System.out.println(line1);  // Should print MyLine[begin=(0, 0), end=(3, 4)]

        // Test getBegin and getEnd
        System.out.println("Begin Point of Line 1: " + line1.getBegin());  // Should print (0, 0)
        System.out.println("End Point of Line 1: " + line1.getEnd());      // Should print (3, 4)

        // Test getLength and getGradient
        System.out.println("Length of Line 1: " + line1.getLength());  // Should print 5.0
        System.out.println("Gradient of Line 1: " + Math.toDegrees(line1.getGradient()));  // Should print angle in degrees

        // Test setting individual coordinates
        line2.setBeginX(1);
        line2.setBeginY(1);
        line2.setEndX(4);
        line2.setEndY(5);
        System.out.println("Updated Line 2:");
        System.out.println(line2);  // Should print MyLine[begin=(1, 1), end=(4, 5)]
    }
}