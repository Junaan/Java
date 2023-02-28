public class Solution
{

    public static void main(String[] args) {
        int N=10;
        printNos(N);
    }
    public static void printNos(int N)
    {
        //Your code here
        if(N<=0){
            return;
        }
        printNos(N-1);
        System.out.print(N+" ");
    }
}


