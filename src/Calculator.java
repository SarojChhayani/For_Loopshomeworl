import java.util.Scanner;
//Making Calculator using the switch statement (The program takes three inputs
//from the user: one operator and 2 numbers. Based on the operator provided
//by the user, it performs the calculation on the numbers. Then the result is
//displayed on the screen.)
public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the operator
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Prompt the user to enter two numbers
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            // Perform the calculation based on the operator
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // Check if the second number is not zero to avoid division by zero error
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        return;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator!");
                    return;
            }

            // Display the result
            System.out.println("Result: " + result);
        }
    }

