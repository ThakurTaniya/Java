import java.util.Scanner;
public class Practical6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number is positive");
        }

        if (num % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        if (num >= 0) {
            if (num == 0) {
                System.out.println("Number is zero");
            } else {
                System.out.println("Number is greater than zero");
            }
        }

        if (num > 10) {
            System.out.println("Number is greater than 10");
        } else if (num == 10) {
            System.out.println("Number is 10");
        } else {
            System.out.println("Number is less than 10");
        }
    }
}