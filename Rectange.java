import java.util.*;
public class Rectange {
    public static void main(String[]args){
        int row,column;
        Scanner sc = new Scanner (System.in);
        row=sc.nextInt();
        column=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(i==1 || i==row || j==1 || j==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.print("\n");
        }
    }
    
}
