public class MyCircle {
     MyPoint center;
     int radius;

    // Default constructor
    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    // Constructor with center's (x, y) and radius
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Constructor with MyPoint instance as center and radius
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Getters
    public MyPoint getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    // Setters
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Getters for center's x and y coordinates
    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    // Setters for center's x and y coordinates
    public void setCenterX(int x) {
        center.setX(x);
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public void setCenterXY(int x, int y) {
        center.setXY(x, y);
    }

    // toString method
    @Override
    public String toString() {
        return "MyCircle radius=" + radius + 
        ", center=" + center;
    }

    // Method to calculate the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to calculate the distance between the centers of two circles
    public double distance(MyCircle another) {
        return center.distance(another.getCenter());
    }
}