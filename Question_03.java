//Write a Java program to print the number whose divisible 5 within a range.
import java.util.Scanner;
class Question_03{
    public static void main(String args[]){
        int range1,range2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the firt range :-");
        range1 = sc.nextInt();
        System.out.print("Enter the firt range :-");
        range2 = sc.nextInt();

        System.out.println("THESE ARE THE NUMBER");
        for(int i = range1;i<=range2;i++){
            if(i%5==0){
                System.out.print(i+", ");
            }
        }
    }
}