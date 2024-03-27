import java.util.Scanner;

//Display Sum of n Natural Number
public class Sum_Natural_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Calculate the sum of the first n natural numbers
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Print the sum
        System.out.println("Sum of the given natural numbers is: " + sum);
    }
}
