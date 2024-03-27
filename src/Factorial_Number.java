import java.util.Scanner;

//Finding factorial of a number entered by user
public class Factorial_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is negative
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
            return;
        }

        // Calculate factorial using a for loop
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the factorial
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
