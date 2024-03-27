import java.util.Scanner;
//Write a program in Java to display n limit of natural numbers and their sum.
public class Natural_Numbers_Sum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the limit
            System.out.print("Enter the limit (n) of natural numbers: ");
            int n = scanner.nextInt();

            // Check if the limit is valid
            if (n <= 0) {
                System.out.println("Error: Please enter a positive integer.");
                return;
            }

            // Calculate the sum of natural numbers up to n
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print(i + " "); // Display the current natural number
                sum += i; // Add the current natural number to the sum
            }

            // Print the sum of natural numbers
            System.out.println("\nSum of the first " + n + " natural numbers is: " + sum);
        }
    }


