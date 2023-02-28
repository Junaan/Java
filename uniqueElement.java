import java.util.*;
public class uniqueElement {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of array\n");
        n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int k=0;
        while(k<n){
            for(int i=k; i<n; i++){
                if(arr[k]==arr[i]){
                    k++;
                }
            }
            System.out.println(arr[k-1]);
        }

    }
}
