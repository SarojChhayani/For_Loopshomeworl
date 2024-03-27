import java.util.Scanner;
//Java Program to Print Multiplication Table for any Number
public class Multiplication_Table {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Print the multiplication table for the entered number
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 12; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }


