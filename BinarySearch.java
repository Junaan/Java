import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter the number to search");
        //int number=sc.nextInt();
        binary(8);
    }
    public static void binary(int n){
        int[] array={1,2,3,4,5,6,7,8,9,10,22,44,66,77};
        int start=0,end=array.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[mid]>n){
                end=mid-1;
            }
            else if (array[mid]<n) {
                start=mid+1;
            }

            else{
                System.out.println("number found @ "+mid);
                break;
            }
        }



    }
}
