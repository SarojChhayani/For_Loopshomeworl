import java.util.Scanner;

public class Series_Sum_Calculator {
        public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the value of n
            System.out.print("Enter a positive integer (n): ");
            int n = scanner.nextInt();

            // Check if the entered value of n is positive
            if (n <= 0) {
                System.out.println("Error: Please enter a positive integer.");
            }

            // Calculate the sum of the series
            double sum = 0.0;
            for (int i = 1; i <= n; i++) {
                sum += 1.0 / i;
            }

            // Print the sum of the series
            System.out.println("Sum of the series is: " + sum);
        }
    }


