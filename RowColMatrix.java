import java.util.Arrays;
import java.util.Scanner;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr={
                {10,20,30,40},  //it is a sorted array,row w.r.to row and column w.r.to column
                {15,25,35,45},
                {28,29,39,49},
                {30,35,40,50}
        };
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to search in 2-D sorted array");
        num=sc.nextInt();
        System.out.println(Arrays.toString(search(arr,num)));
    }
    static int[] search(int [][] matrix,int target){
        int r=0;
        int col= matrix.length-1;
        while(r< matrix.length && col>=0){
            if(matrix[r][col]==target){
                return new int[]{r+1,col+1};
            } else if (matrix[r][col]<target) {
                r++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
