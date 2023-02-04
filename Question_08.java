
//Write a java program to find the fabonacci series within a given range.
import java.util.Scanner;

class Question_08 {
    public static void main(String args[]) {
        int num, first_term = 0, second_term = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term from where you want to print :- ");
        num = sc.nextInt();
        // FABONACCI SERIES LIKE :- 0 1 1 2 3 5...
        System.out.println("YOUR FIBONACCI SERIES IS :-");
        System.out.print(first_term + " " + second_term + " ");
        for (int i = 1; i <= num - 2; i++) {

            int sum = first_term + second_term;
            first_term = second_term;
            second_term = sum;
            System.out.print(sum + " ");

        }
    }
}