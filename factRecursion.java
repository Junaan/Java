import java.util.Scanner;

public class factRecursion {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        System.out.println(factorial(num));
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return n;
        }
        return n*factorial(n-1);
    }
}
