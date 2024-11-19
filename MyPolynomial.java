public class MyPolynomial {
     double[] coeffs;

    // Constructor with variable number of arguments (varargs)
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // Method to get the degree of the polynomial
    public int getDegree() {
        return coeffs.length - 1;
    }

    // toString method
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (i != coeffs.length - 1) {
                sb.append(coeffs[i] >= 0 ? "+" : "");
            }
            sb.append(coeffs[i]);
            if (i > 0) {
                sb.append("x^").append(i);
            }
        }
        return sb.toString();
    }

    // Method to evaluate the polynomial for a given x
    public double evaluate(double x) {
        double result = 0;
        for (int i = coeffs.length - 1; i >= 0; i--) {
            result = result * x + coeffs[i];
        }
        return result;
    }

    // Method to add another polynomial to this polynomial
    public MyPolynomial add(MyPolynomial another) {
        int maxDegree = Math.max(this.getDegree(), another.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double thisCoeff = i <= this.getDegree() ? this.coeffs[i] : 0;
            double anotherCoeff = i <= another.getDegree() ? another.coeffs[i] : 0;
            newCoeffs[i] = thisCoeff + anotherCoeff;
        }

        this.coeffs = newCoeffs;
        return this;
    }

    // Method to multiply this polynomial with another polynomial
    public MyPolynomial multiply(MyPolynomial another) {
        int newDegree = this.getDegree() + another.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= another.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * another.coeffs[j];
            }
        }

        this.coeffs = newCoeffs;
        return this;
    }
}
