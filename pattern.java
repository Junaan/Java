import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //System.out.println("enter the number");
        //int num= sc.nextInt();
        /*for (int i=0; i<num; i++){
            System.out.println();
        }*/
        for(int j=0, i=1; i<5; i++){
            System.out.println(i*(j+=(int)Math.pow(10,(i-1))));
        }
    }
}
