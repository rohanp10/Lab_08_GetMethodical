import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Test Part A

        String name = SafeInput.getNonZeroLenString(in, "Enter your name");

        System.out.println("\nYour name is " + name);


        // Test Part B

        /*
        int number = SafeInput.getInt(in, "Enter an integer");

        System.out.println("\nYour integer is " + number);
         */

        // Test Part C

        /*
        double number = SafeInput.getDouble(in, "Enter a double");

        System.out.println("\nYour double is " + number);
         */

        // Test Part D

        /*
        int number = SafeInput.getRangedInt(in, "Enter a number", 1, 10);

        System.out.println("Your number " + number + " is within the range");
         */

        // Test Part E

        /*
        double number = SafeInput.getRangedDouble(in, "Enter a number", 2.5, 5.0);

        System.out.println("Your number " + number + " is within the range");
         */

        // Test Part F

        /*
        boolean test = SafeInput.getYNConfirm(in, "Do you want to continue");
         */

        // Test Part G

        /*
        String pattern = "^\\d{5}$";
        SafeInput.getRegExString(in, "Enter a five digit number", pattern);
         */

    }
}