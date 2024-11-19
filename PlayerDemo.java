public class PlayerDemo {
    public static void main(String[] args) {
        // Create a Ball object
        Ball ball = new Ball(5.0f, 5.0f, 0.0f);

        // Create Player objects
        Player player1 = new Player(1, 0.0f, 0.0f);
        Player player2 = new Player(2, 10.0f, 10.0f);

        // Test getters
        System.out.println(player1); // Player 1 at initial position
        System.out.println(player2); // Player 2 at initial position

        // Test move method
        player1.move(5.0f, 5.0f);
        System.out.println(player1); // Player 1 moved to new position

        player2.move(-5.0f, -5.0f);
        System.out.println(player2); // Player 2 moved to new position

        // Test jump method
        player1.jump(3.0f);
        System.out.println(player1); // Player 1 after jumping

        player2.jump(2.0f);
        System.out.println(player2); // Player 2 after jumping

        // Test near method
        System.out.println("Player 1 near ball: " + player1.near(ball)); // Check proximity to ball
        System.out.println("Player 2 near ball: " + player2.near(ball)); // Check proximity to ball

        // Test kick method
        player1.kick(ball);
        System.out.println("Ball position after kick by Player 1: " + ball);

        player2.kick(ball);
        System.out.println("Ball position after kick by Player 2: " + ball);
    }
}
