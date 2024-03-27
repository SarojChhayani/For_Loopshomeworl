//Print any 10 numbers between given/user input range. For eg. Print numbers
//between 23-33
import java.util.Scanner;

public class Number_printer {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the starting number
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        // Prompt the user to enter the ending number
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();
        // Print 10 numbers between the given range
        System.out.println("10 numbers between " + start + " and " + end + ":");
        for (int i = 0; i < 10; i++) {
            System.out.println((start + i) + " ");
        }
        }

    }
