import java.util.*;
public class rotate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8};
        int shift=3;
        int len=nums.length;
        
        rightShift(nums, 0, len-1-shift);

        rightShift(nums, len-shift, len-1);

        rightShift(nums, 0, len-1);

        //for left shift
        leftShift(nums, shift, len-1);
        leftShift(nums, 0, shift-1);
        leftShift(nums, 0, len-1);

        System.out.println(Arrays.toString(nums));
    }
    
    public static void rightShift(int[] nums, int start, int end ){
        while(start<end){
            int temp= nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void leftShift(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
