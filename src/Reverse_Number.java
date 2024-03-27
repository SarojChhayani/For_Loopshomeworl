import java.util.Scanner;

public class Reverse_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.print("Enter a number (up to 5 digits): ");
        int number = scanner.nextInt();

        // Check if the number is within the range of 5 digits
        if (number < 0 || number > 99999) {
            System.out.println("Error: Please enter a number up to 5 digits.");
            return;
        }

        int reversenumber = 0;

        // Reverse the number using a for loop
        for (int i = number; i != 0; i /= 10) {
            int digit = i % 10; // Extract the last digit
            reversenumber = reversenumber * 10 + digit; // Build the reversed number
        }

        // Print the reversed number
        System.out.println("Reversed number: " + reversenumber);
    }
}

