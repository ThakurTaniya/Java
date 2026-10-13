// Write a Java program to demonstrate the use of for loop, continue, and break statements to print numbers from 1 to 20, skip 5, and stop the loop when the number reaches 15.

public class Practical8 {
public static void main(String[] args) {

    for (int i = 1; i <= 20; i++) {
        if (i == 5) {
            continue;
        }

        if (i == 15) {
            break;
        }

        System.out.println(i);
    }
}

}

