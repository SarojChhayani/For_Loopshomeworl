public class Divisible_By_3_And_5 {
    //WAP to print the numbers between 1 to 100 which can be divided by 3 and 5
    //separately
        public static void main(String[] args) {
            System.out.println("Numbers divisible by 3:");
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + ",");
                }
            }

            System.out.println("\nNumbers divisible by 5:");
            for (int i = 1; i <= 100; i++) {
                if (i % 5 == 0) {
                    System.out.print(i + ",");
                }
            }
        }
    }


