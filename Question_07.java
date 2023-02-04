
//Write a java program to find the number is palindrome within a given range.
import java.util.Scanner;

class Question_07 {
    public static void main(String args[]) {
        int num1, num2, rem, rev = 0, dummy;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number :- ");
        num1 = sc.nextInt();
        System.out.print("Enter the last number :- ");
        num2 = sc.nextInt();
        System.out.println("THESE ARE THE PALINDROME NUMBERS:-");
        for (int i = num1; i <= num2; i++) {
            rev = 0;
            dummy = i;
            while (dummy != 0) {
                rem = dummy % 10;
                rev = rev * 10 + rem;
                dummy = dummy / 10;
            }
            if (rev == i) {
                System.out.print(i + ", ");
            }
        }
    }
}