public class NonOverlapping {
    public static void main(String[] args) {
        int[][] intervals={{1,2},{2,3},{3,4},{1,3}};
        int row=intervals.length;
        // int col=intervals[0].length
        int count=0;
        int i=0;
        for(int j=i+1; j<row; j++){
            if(intervals[i][1]>intervals[j][0]){
                count+=1;
                i=j;
                }
            }
        
        System.out.println(count); 
    }
    
}
