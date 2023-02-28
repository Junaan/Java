import java.util.Scanner;
class leap {
    public static void main(String[] args){
        int year;
        Scanner o = new Scanner(System.in);
        System.out.println("enter the year");
        year=o.nextInt();
        
        if(year%4==0  || year %100==0){
            System.out.println("year is leap");

        }
        else{
            System.out.println("year is not leap");
        }
}

}
