public class evenParity {
    public static void main(String[] args) {
        int []nums={4,2,5,7};
        int k=nums.length-2;
        int temp=0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]%2!=0){
                temp=nums[k];
                nums[k]=nums[i];
                nums[i]=temp;
                k-=2;
            }
        }
        System.out.println( nums);
    }
}

