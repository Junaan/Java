import java.util.ArrayList;
import java.util.Scanner;

public class MultiAl {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>(5);
        Scanner sc=new Scanner(System.in);
        //initialisation
        for(int i=0; i<5;i++){
            list.add(new ArrayList<>());
        }
        //adding element
        for(int i=0;i<5; i++){
            for(int j=0; j<5; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
