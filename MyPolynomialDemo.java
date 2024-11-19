public class MyPolynomialDemo {
    public static void main(String[] args) {
        // Create polynomials using varargs
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        
        // Create polynomial using array
        double[] coeffs = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial p3 = new MyPolynomial(coeffs);

        // Test getDegree method
        System.out.println("Degree of p1: " + p1.getDegree());  // Should print 2
        System.out.println("Degree of p2: " + p2.getDegree());  // Should print 4
        System.out.println("Degree of p3: " + p3.getDegree());  // Should print 3

        // Test toString method
        System.out.println("p1: " + p1);  // Should print 3.3x^2+2.2x^1+1.1
        System.out.println("p2: " + p2);  // Should print 5.5x^4+4.4x^3+3.3x^2+2.2x+1.1
        System.out.println("p3: " + p3);  // Should print 7.8x^3+5.6x^2+3.4x+1.2

        // Test evaluate method
        System.out.println("p1 evaluated at x=2: " + p1.evaluate(2));  // Should print the result of evaluating p1 at x=2

        // Test add method
        System.out.println("p1 + p3: " + p1.add(p3));  // Should print the result of adding p3 to p1

        // Test multiply method
        System.out.println("p1 * p3: " + p1.multiply(p3));  // Should print the result of multiplying p1 with p3
    }
}
