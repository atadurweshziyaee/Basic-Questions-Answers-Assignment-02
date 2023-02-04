
//Write a java program to find the factorial of any number.
import java.util.Scanner;

class Question_09 {
    public static void main(String args[]) {
        long num,factorial=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :-");
        num = sc.nextLong();

        for(long i=num;i>=1;i--){
            factorial = factorial * i;
        }
        System.out.println("The factorial of "+num+" is "+factorial);
    }
}