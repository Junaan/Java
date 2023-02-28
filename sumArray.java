public class sumArray {
    //two array have integers add both arrays as each array represent a number
    public static void main(String[] args) {
        int a1[]={4,5,1};
        int a2[]={3,4,5};
        int i=a1.length-1;
        int j=a2.length-1;
        int sumarray[]=new int[Math.max(i,j)];
        int k=sumarray.length-1;
        int sum=0,carry=0;
        while(i>=0 || j>=0){
            sum=0;
            if(i>=0){
                sum+=a1[i];
                i--;
            }
            if(j>=0){
                sum+=a2[j];
                j--;
            }
            sum+=carry;
            int lastdigit=sum%10;
            carry=sum/10;
            sumarray[k]=lastdigit;
            k--;
        }
        if(carry!=0){
            int a4[]=new int[sumarray.length+1];
            a4[0]=carry;
            for(int  z=1; z<a4.length; z++){
                a4[z]=sumarray[z-1];
            }
            return a4;
        }
        return sumarray;
    }
}
