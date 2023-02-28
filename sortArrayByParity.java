class sortArrayByParity{
    public static void main(String[] args) {
        int[] nums={0,2};
        int k=0;
        int temp=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                temp=nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                //nums[i]=nums[i]+nums[k];
                //nums[k]=nums[i]-nums[k];
                //nums[i]=nums[i]-nums[k];
                k++;
            }
        }
        System.out.println(nums);
    }
}