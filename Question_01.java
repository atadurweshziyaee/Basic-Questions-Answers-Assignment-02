//Write a Java program to print the even numbers from a given range.
import java.util.Scanner;
class Question_01{
    public static void main(String args[]){
        int range1,range2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the firt range :-");
        range1 = sc.nextInt();
        System.out.print("\nEnter the second range :-");
        range2 = sc.nextInt();

        System.out.println("YOUR EVEN NUMBER");
        for(int i = range1;i<=range2;i++){
            if(i%2==0){
                System.out.print(i+", ");
            }
        }
    }
}