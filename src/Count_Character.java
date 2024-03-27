import java.util.Scanner;
//WAP to enter any String and count total number of 'a' in that String.
public class Count_Character {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Initialize a variable to store the count of 'a'
            int count = 0;

            // Loop through each character in the string
            for (int i = 0; i < input.length(); i++) {
                // Check if the current character is 'a'
                if (input.charAt(i) == 'a') {
                    count++;
                }
            }

            // Print the total count of 'a' in the string
            System.out.println("Total number of 'a' in the string: " + count);
        }
    }

