public class sort {
    // sort an array using a single loop for 3 different but repeatative elements
    public static void main(String[] args) {
        int arr[]={2,1,0,0,2,1,1};
        int low=0,temp,mid=0,high=arr.length-1;
        while(mid<=high){
            switch (arr[mid]){
                case 0:{
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=temp;
                    high--;
                    break;
                }
            }
        }
    }
}
