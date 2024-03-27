//Program to check whether input number is prime or not
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean Prime = true;

        // Check if the number is divisible by any number other than 1 and itself
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                Prime = false;
            }
        }

        // Print the result
        if (Prime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
