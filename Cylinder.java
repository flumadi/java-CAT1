public class Cylinder extends Circle {
     double height;

    // Constructor with default color, radius, and height
    public Cylinder() {
        super(); // Call superclass no-arg constructor Circle()
        this.height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // Call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // Call superclass constructor Circle(radius)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder using superclass method getArea() to get the base area
    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder: radius=" + getRadius() + " height=" + height + " base area=" + getArea() + " volume=" + getVolume();
    }
}
