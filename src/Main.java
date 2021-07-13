import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int N,min,max;

        System.out.print("How many numbers do you have:");
        N = scanner.nextInt();

        if (N == 0){

            System.out.println("!Goodbye!");

        }else {

            System.out.print("Enter 1.Number : ");
            min = scanner.nextInt();
            max = min;

            for (int i = 1; i < N; i++) {

                System.out.print("Enter " + (i + 1) + ".Number : ");
                int number = scanner.nextInt();

                if (number < min) {

                    min = number;

                }

                if (number > max) {

                    max = number;

                }

            }

            System.out.println("\n****************");
            System.out.println("Max : " + max);
            System.out.println("Min : " + min);
            System.out.println("****************");

        }












    }
}
