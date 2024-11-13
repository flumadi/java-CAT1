public class MyComplexDemo{
    public static void main(String[] args) {
        // Test default constructor
        MyComplex c1 = new MyComplex();
        System.out.println("Default Constructor:");
        System.out.println(c1);  // Should print (0.0 + 0.0i)

        // Test parameterized constructor
        MyComplex c2 = new MyComplex(3, 4);
        System.out.println("Parameterized Constructor:");
        System.out.println(c2);  // Should print (3.0 + 4.0i)

        // Test setters and getters
        c1.setReal(1.5);
        c1.setImag(2.5);
        System.out.println("Setters and Getters:");
        System.out.println("Real: " + c1.getReal());  // Should print 1.5
        System.out.println("Imag: " + c1.getImag());  // Should print 2.5

        // Test setValue
        c1.setValue(2.2, 3.3);
        System.out.println("Set Value:");
        System.out.println(c1);  // Should print (2.2 + 3.3i)

        // Test isReal and isImaginary
        System.out.println("Is Real: " + c1.isReal());  // Should print false
        System.out.println("Is Imaginary: " + c1.isImaginary());  // Should print false

        // Test equals methods
        System.out.println("Equals (2.2, 3.3): " + c1.equals(2.2, 3.3));  // Should print true
        System.out.println("Equals c2: " + c1.equals(c2));  // Should print false

        // Test magnitude
        System.out.println("Magnitude: " + c1.magnitude());  // Should print the magnitude of c1

        // Test argument
        System.out.println("Argument: " + c1.argument());  // Should print the argument of c1

        // Test add, subtract, multiply, divide, and conjugate
        c1.add(c2);
        System.out.println("After Add:");
        System.out.println(c1);  // Should print the result of adding c2 to c1

        MyComplex c3 = c1.subtractNew(c2);
        System.out.println("Subtract New:");
        System.out.println(c3);  // Should print the result of subtracting c2 from c1 into a new MyComplex instance

        c1.multiply(c2);
        System.out.println("After Multiply:");
        System.out.println(c1);  // Should print the result of multiplying c2 with c1

        c1.divide(c2);
        System.out.println("After Divide:");
        System.out.println(c1);  // Should print the result of dividing c2 into c1

        c1.conjugate();
        System.out.println("After Conjugate:");
        System.out.println(c1);  // Should print the complex conjugate of c1
    }
}
