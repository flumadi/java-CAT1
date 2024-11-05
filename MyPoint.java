public class MyPoint {
    private int x;
    private int y;

    // Default (no-arg) constructor
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Overloaded constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get both x and y in an array
    public int[] getXY() {
        return new int[] { x, y };
    }

    // toString method
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Method to calculate the distance to another point (x, y)
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Overloaded method to calculate the distance to another MyPoint instance
    public double distance(MyPoint another) {
        return distance(another.getX(), another.getY());
    }

    // Method to calculate the distance to the origin (0, 0)
    public double distance() {
        return distance(0, 0);
    }
}