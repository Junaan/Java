import java.util.*;

public class canWin {



    public static boolean canWin(int leap, int[] game, int i) {
             if(i>game.length-1){
            return true;}
        if(i<0 || game[i]==1){
            return false;
        }
        game[i]=1;
        return canWin(leap, game, i+leap)||canWin(leap, game, i+1)||canWin(leap, game, i-1);
    }



    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
*/
            int[] game ={0,0,1,1,1,0};
 /*           for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
      */
            System.out.println( (canWin(3, game, 0)) ? "YES" : "NO" );
        }
        //scan.close();
    }
