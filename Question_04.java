// Write a java program to print the prime numbers within a given range.
// Find how many prime numbers are there in given range.

import java.util.Scanner;
class Question_04{
    public static void main(String args[]){
        int range1,range2,count=0,count2=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the firt range :- ");
        range1 = sc.nextInt();
        System.out.print("Enter the last range :- ");
        range2 = sc.nextInt();


        System.out.println("YOUR PRIME NUMBER");
        for(int i=range1;i<=range2;i++){
            count=0;
            for(int j=1;j<=range2;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count ==2){
                System.out.print(i+", ");
                count2++;
            }
        }
        System.out.println("\nHow many prime number between "+range1+" to "+range2);
        System.out.println(count2+" Prime numbers.");
    }


}