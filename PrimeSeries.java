import java.util.Scanner;

public class PrimeSeries {
    public static void main(String[] args) {
        int lower,upper;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the lower bound");
        lower=sc.nextInt();
        System.out.println("enter the upper bound");
        upper=sc.nextInt();
        Prime(lower,upper);
    }
    public static void Prime(int l,int u) {
        int flag=0;
        for (int i = l; i <= u; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag=1;
                    break;
                }
            }
            if(flag==0){
            System.out.println(i+" ");
        }
        }

    }
}
