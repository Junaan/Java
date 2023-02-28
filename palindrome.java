import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter the number");
        num=sc.nextInt();
        palindrome(num);
    }
    public static void palindrome(int number){
        int sum=0,temp;
        temp=number;
        while(number>0){
            int d=number%10;
            sum=(sum*10)+d;
            number=number/10;
        }
        if (temp==sum){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }
}
