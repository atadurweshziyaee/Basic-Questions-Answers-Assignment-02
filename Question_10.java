
//Write a java program to find the three digit armstrong number with a given range;

import java.util.Scanner;

class Question_10 {
    public static void main(String[] args) {
        int first, last;
        Scanner sc = new Scanner(System.in);    // Taking input from the user.
        System.out.println("Enter the first range : ");
        first = sc.nextInt();
        System.out.println("Enter the last number : ");
        last = sc.nextInt();

        System.out.println("\n\n\tYOUR ARMSTRONG NUMBERS " + first + " TO " + last + " are :-");
        for (int i = first; i <= last; i++) {
            int dummy = i;
            double rem, sum = 0;

            while (dummy != 0) {
                rem = dummy % 10;
                sum = sum + Math.pow(rem, 3);
                dummy = dummy / 10;
            }
            if (i != 1) {
                if (sum == i) {
                    System.out.println("\n\t\t" + "---> " + i + " <---");
                }
            }
        }

    }
}