import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
        /*   1 2 3
             4 5 6
             7 8 9          2-d array
         */
        Scanner sc= new Scanner(System.in);
        int [][] arr=new int[3][3];   //adding rows is mandatory but not column, line 7 and 8 are basically same
        int [][] array={
                {1,2,3},   //0 index
                {4,5},   //1st index
                {7,8,9,10}    //2nd index
        };
        System.out.println(arr.length);
        System.out.println(array.length);
        // input
        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col]=sc.nextInt();
            }
        }
        for (int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+' ');
            }
            System.out.println();
        }
        for(int row=0; row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
