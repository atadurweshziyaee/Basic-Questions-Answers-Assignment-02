// Write a java program to find the number is armstrong number or not.

import java.util.Scanner;
class Question_05 {
    public static void main(String args []){
        int num,rem,quo,dummy;
        double armstrong,sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digit number :- ");
        num = sc.nextInt();
        dummy = num;
        while(num!=0){
            rem = num%10;
            armstrong = Math.pow(rem,3);
            num = num/10;
            sum = sum +(int)armstrong;
        }
        if(dummy == sum){
            System.out.println("The number "+dummy+" is a armstrong number");
        }
        else{
            System.out.println("The number "+dummy+" is not a armstrong number");
        }

    }
}