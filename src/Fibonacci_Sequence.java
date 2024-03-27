//Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number) – limitation is n.
import java.util.Scanner;

public class Fibonacci_Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // Prompt the user to enter the limit for the Fibonacci sequence
        System.out.print("Enter the limit (n): ");
        int n = scanner.nextInt();

        // Fibonacci sequence initialization
        int a = 1; // First Fibonacci number
        int b = 1; // Second Fibonacci number

        System.out.println("Fibonacci sequence up to " + n + ":");
        // Print the first two Fibonacci numbers
        System.out.println(a + " " );
        System.out.println( b + " ");
        // Loop to calculate and print Fibonacci numbers up to the limit
        for (int i = 2; i < n; i++) {
            int next = a + b; // Calculate the next Fibonacci number
            a = b; // Update the first Fibonacci number
            b = next; // Update the second Fibonacci number

            System.out.println(next + " ");

        }
    }
}