import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to print fibonacci series");
        number=sc.nextInt();
        fibonacci(5);

    }

    public static void fibonacci(int num){
        int a=0,b=1,c,count=0;
        while (num>0){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            fibonacci(num-1);
        }
    }
}
