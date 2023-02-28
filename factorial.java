import java.util.*;
public class factorial {
    private static Scanner sc = new Scanner(System.in);
    public static int printFactorial(int n){
        int fact=1;
        for(int i=n; i>=1; i--){
            fact=fact*i;
        }
        return (fact);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int factorial = printFactorial(n);
        System.out.println(factorial);
    }
    
}
