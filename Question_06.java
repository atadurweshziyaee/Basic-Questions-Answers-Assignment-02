import java.util.Scanner;
class Question_06 {
    public static void main(String args[]){
        long num,rem,rev=0,dummy;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :- ");
        num = sc.nextLong();
        dummy = num;
        while(num!=0){
            rem = num%10;
            rev = rev * 10 + rem;
            num = num/10;
        }
        if(dummy == rev){
            System.out.println("The number "+dummy+" is palindrome");
        }
        else{
            System.out.println("The number "+dummy+" is not palindrome");
        }

    }
}