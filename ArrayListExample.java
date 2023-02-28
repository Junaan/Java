import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(59);
        list.add(599);
        list.add(55);
        list.add(11);
        list.add(4587);
        list.add(899);
        list.add(555);
        list.add(111);
        list.set(0,90);
        list.remove(11);
        System.out.println(list);
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.contains(899));
        System.out.println(list.contains(5546));


    }
}
