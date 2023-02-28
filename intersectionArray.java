import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersectionArray {
    public static void main(String[] args) {
        int[] n2= {9,4,9,8,4};
        int[] n1={4,9,5};
        intersection(n1,n2);
    }
    public static void intersection(int[] nums1, int[] nums2) {
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            for(int j=0;j<nums2.length; j++){
                if(list.contains(nums1[i]))
                    break;
                if(nums1[i]==nums2[j])
                    list.add(nums1[i]);
            }
        }
        int [] arr=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
        System.out.println(Arrays.toString(arr));

    }
}

