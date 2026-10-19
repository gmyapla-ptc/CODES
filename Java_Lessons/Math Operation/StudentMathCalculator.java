/* Challenge A: Student Math Calculator
Objective: Practice the five arithmetic operators in Java.

Create a class named StudentMathCalculator.

Requirements:
1. Declare int a = 23; and int b = 5;.
2. Calculate the sum, difference, product, integer quotient, and remainder.
3. Calculate the decimal quotient using double.
4. Use at least one compound assignment operator (+=, -=, *=, /=, or %=).
5. Print each result with a descriptive label. */

class StudentMathCalculator {
    public static void main (String [] args) {

        int a = 23;
        int b = 5;
        double c = (double) a / b;


        System.out.println("=== STUDENT MATH CALCULATOR ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum:  "+ (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: "+ (a * b));
        System.out.println("Integer Quotient: " + (a / b));
        System.out.println("Remainder:  " + (a % b));
        System.out.println("Decimal Quotient: " + c);
        System.out.println("Update Value:  " + (a *= 5));
        
        
    }
}
