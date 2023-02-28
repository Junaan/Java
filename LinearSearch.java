import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to search");
        int number=sc.nextInt();
        Linear(number);
    }
    public static void Linear(int num){
        int[] arr={5,8,2,1,4,6,8};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("number found at "+i+" index");
            }
        }
    }
}
