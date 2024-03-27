import java.util.Scanner;

//write a program that prints the sum of x ranging from 1 to 20.
public class Sum_Of_X {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of x
        System.out.print("Enter the value of x (1 to 20): ");
        int x = scanner.nextInt();

        // Validate user input
        if (x < 1 || x > 20) {
            System.out.println("Error: Value of x must be between 1 and 20.");
        }

        // Calculate the sum of numbers from 1 to x
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }

        // Print the sum
        System.out.println("Sum of numbers from 1 to " + x + " is: " + sum);
            }
        }




