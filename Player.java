public class Player {
     int number;
     float x, y, z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public int getNumber() {
        return number;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float distance = (float) Math.sqrt(Math.pow(this.x - ball.getX(), 2) + Math.pow(this.y - ball.getY(), 2));
        return distance < 8;
    }

    public void kick(Ball ball) {
        // Assuming kick moves the ball to a new position based on player's position
        ball.setX(this.x + (float) (Math.random() * 10 - 5));
        ball.setY(this.y + (float) (Math.random() * 10 - 5));
        ball.setZ(0.0f); // Ball is on the ground after kick
    }

    @Override
    public String toString() {
        return "Player " + number + " at (" + x + ", " + y + ", " + z + ")";
    }
}
