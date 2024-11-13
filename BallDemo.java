public class BallDemo{
    public static void main(String[] args) {
        // Create a Ball object
        Ball ball = new Ball(1.0f, 2.0f, 3.0f);

        // Test getX, getY, getZ methods
        System.out.println("X: " + ball.getX()); // Output: X: 1.0
        System.out.println("Y: " + ball.getY()); // Output: Y: 2.0
        System.out.println("Z: " + ball.getZ()); // Output: Z: 3.0

        // Test setXYZ method
        ball.setXYZ(4.0f, 5.0f, 6.0f);
        System.out.println("After setXYZ: " + ball); // Output: After setXYZ: Ball at (4.0, 5.0, 6.0)

        // Test toString method
        System.out.println("Ball coordinates: " + ball.toString()); // Output: Ball coordinates: Ball at (4.0, 5.0, 6.0)
    }
}
