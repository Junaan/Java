import java.util.*;
public class partition {
    public static List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            map.put(ch,i);
        }
        List<Integer> ans = new ArrayList<>();
        int prev=-1;
        int max=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            max=Math.max(max,map.get(ch));
            if(max==i){
                ans.add(max - prev);
                prev=max;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s="ababcbacadefegdehijhklij";
        System.out.println( partitionLabels(s));
        
    }
    
}
