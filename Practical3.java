// Program 3. Write a Java program to convert an int value into double using widening type conversion and a double value into int using narrowing type conversion. Display the original and converted values.

public class Practical3 {
    public static void main(String[] args) {

        int num = 25;

        // Widening conversion: int → double
        double doubleValue = num;

        double decimal = 25.75;

        // Narrowing conversion: double → int
        int intValue = (int) decimal;

        System.out.println("Original int value: " + num);
        System.out.println("Converted to double: " + doubleValue);

        System.out.println("Original double value: " + decimal);
        System.out.println("Converted to int: " + intValue);
    }
}