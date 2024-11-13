public class MyComplex {
    private double real;
    private double imag;

    // Constructors
    public MyComplex() {
        this.real = 0.0;
        this.imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters and setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    // Method to set the value
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // toString method
    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    // Methods to check if real or imaginary
    public boolean isReal() {
        return imag == 0;
    }

    public boolean isImaginary() {
        return real == 0;
    }

    // Methods to check equality
    public boolean equals(double real, double imag) {
        return Math.abs(this.real - real) < 1e-8 && Math.abs(this.imag - imag) < 1e-8;
    }

    public boolean equals(MyComplex another) {
        return Math.abs(this.real - another.real) < 1e-8 && Math.abs(this.imag - another.imag) < 1e-8;
    }

    // Method to calculate magnitude
    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    // Method to calculate argument in radians
    public double argument() {
        return Math.atan2(imag, real);
    }

    // Method to add and return this instance
    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    // Method to add and return a new instance
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }

    // Method to subtract and return this instance
    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    // Method to subtract and return a new instance
    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }

    // Method to multiply and return this instance
    public MyComplex multiply(MyComplex right) {
        double newReal = this.real * right.real - this.imag * right.imag;
        double newImag = this.real * right.imag + this.imag * right.real;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    // Method to divide and return this instance
    public MyComplex divide(MyComplex right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        double newReal = (this.real * right.real + this.imag * right.imag) / denominator;
        double newImag = (this.imag * right.real - this.real * right.imag) / denominator;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    // Method to return the complex conjugate
    public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
    }
}
