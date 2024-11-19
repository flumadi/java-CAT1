public class SoccerGame {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0, 0);

        Player player1 = new Player(1, 0, 0);
        Player player2 = new Player(2, 10, 10);

        // Test move method
        player1.move(5, 5);
        System.out.println(player1); // Player 1 position

        player2.move(-5, -5);
        System.out.println(player2); // Player 2 position

        // Test jump method
        player1.jump(2);
        System.out.println(player1); // Player 1 z position after jump

        player2.jump(2);
        System.out.println(player2); // Player 2 z position after jump

        // Test near method
        System.out.println("Player 1 near ball: " + player1.near(ball));
        System.out.println("Player 2 near ball: " + player2.near(ball));

        // Test kick method
        player1.kick(ball);
        System.out.println("Ball position after kick by Player 1: " + ball);

        player2.kick(ball);
        System.out.println("Ball position after kick by Player 2: " + ball);

        // Simple soccer game with 2 teams
        Player[] team1 = {new Player(1, 0, 0), new Player(2, 1, 1)};
        Player[] team2 = {new Player(3, 10, 10), new Player(4, 11, 11)};

        // Simulate some moves and kicks for team 1
        team1[0].move(2, 2);
        team1[1].move(3, 3);
        team1[0].kick(ball);
        System.out.println("Ball position after kick by Team 1 Player 1: " + ball);

        // Simulate some moves and kicks for team 2
        team2[0].move(-2, -2);
        team2[1].move(-3, -3);
        team2[1].kick(ball);
        System.out.println("Ball position after kick by Team 2 Player 2: " + ball);
    }
}
