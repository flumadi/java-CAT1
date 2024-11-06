public class Circle {
     double radius;
     String color;

    // Default constructor
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    // Constructor with radius and color
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}
