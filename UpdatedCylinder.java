public class UpdatedCylinder extends Circle {
    double height;

    // Constructor with default color, radius, and height
    public UpdatedCylinder() {
        super(); // Call superclass no-arg constructor Circle()
        this.height = 1.0;
    }

    // Constructor with default radius, color but given height
    public UpdatedCylinder(double height) {
        super(); // Call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public UpdatedCylinder(double radius, double height) {
        super(radius); // Call superclass constructor Circle(radius)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // Override the getArea() method to compute the surface area of the cylinder
    @Override
    public double getArea() {
        // Surface area = 2πrh + 2πr^2
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Override the getVolume() method to compute the volume of the cylinder
    public double getVolume() {
        return super.getArea() * height;
    }

    // Provide a toString() method that overrides the toString() in Circle
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}
