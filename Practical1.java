// Program 1: Student Profile Card Using 8 Primitive Data Types

// byte, short, int, long, float, double, char, boolean

public class Practical1 {
    public static void main(String[] args) {

        // 1. byte
        byte age = 19;

        // 2. short
        short rollNo = 1025;

        // 3. int
        int registrationNo = 123456;

        // 4. long
        long phoneNumber = 9876543210L;

        // 5. float
        float height = 5.7f;

        // 6. double
        double percentage = 85.75;

        // 7. char
        char grade = 'A';

        // 8. boolean
        boolean isStudent = true;

        // Display Student Profile
        System.out.println("===== STUDENT PROFILE =====");
        System.out.println("Age             : " + age);
        System.out.println("Roll Number     : " + rollNo);
        System.out.println("Registration No : " + registrationNo);
        System.out.println("Phone Number    : " + phoneNumber);
        System.out.println("Height          : " + height + " ft");
        System.out.println("Percentage      : " + percentage + "%");
        System.out.println("Grade           : " + grade);
        System.out.println("Is Student      : " + isStudent);
    }
}