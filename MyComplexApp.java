import java.util.Scanner;

public class MyComplexApp {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for the first complex number
            System.out.print("Enter real part of the first complex number: ");
            double real1 = scanner.nextDouble();
            System.out.print("Enter imaginary part of the first complex number: ");
            double imag1 = scanner.nextDouble();
            MyComplex complex1 = new MyComplex(real1, imag1);

            // Prompt user for the second complex number
            System.out.print("Enter real part of the second complex number: ");
            double real2 = scanner.nextDouble();
            System.out.print("Enter imaginary part of the second complex number: ");
            double imag2 = scanner.nextDouble();
            MyComplex complex2 = new MyComplex(real2, imag2);

            // Print the complex numbers
            System.out.println("First complex number: " + complex1);
            System.out.println("Second complex number: " + complex2);

            // Check for real, imaginary and equality
            System.out.println("First complex number is real: " + complex1.isReal());
            System.out.println("First complex number is imaginary: " + complex1.isImaginary());
            System.out.println("Second complex number is real: " + complex2.isReal());
            System.out.println("Second complex number is imaginary: " + complex2.isImaginary());
            System.out.println("The two complex numbers are equal: " + complex1.equals(complex2));

            // Perform arithmetic operations
            System.out.println("Adding the two complex numbers gives: " + complex1.addNew(complex2));
            complex1.add(complex2);
            System.out.println("Adding the second complex number into the first gives: " + complex1);

            System.out.println("Subtracting the two complex numbers gives: " + complex1.subtractNew(complex2));
            complex1.subtract(complex2);
            System.out.println("Subtracting the second complex number from the first gives: " + complex1);

            System.out.println("Multiplying the two complex numbers gives: " + complex1.multiply(complex2));
            System.out.println("Dividing the first complex number by the second gives: " + complex1.divide(complex2));

            System.out.println("The conjugate of the first complex number is: " + complex1.conjugate());
        } // Scanner will be automatically closed here
    }
}
