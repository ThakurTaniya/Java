// Program 4: WAP to demonstrate the use of arithmetic, assignment, comparison, logical, and bitwise operators. Display the result of each operation.

public class Practical5{
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Assignment operators
        int c = a;
        System.out.println("\nAssignment Operators:");
        c += b;
        System.out.println("c += b: " + c);
        c -= b;
        System.out.println("c -= b: " + c);
        c *= b;
        System.out.println("c *= b: " + c);
        c /= b;
        System.out.println("c /= b: " + c);

        // Comparison operators
        System.out.println("\nComparison Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical operators
        System.out.println("\nLogical Operators:");
        System.out.println("(a > b) && (a > 0): " + ((a > b) && (a > 0)));
        System.out.println("(a > b) || (a < 0): " + ((a > b) || (a < 0)));
        System.out.println("!(a > b): " + (!(a > b)));

        // Bitwise operators
        System.out.println("\nBitwise Operators:");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
    }
}