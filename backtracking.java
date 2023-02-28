import java.util.Arrays;

public class backtracking {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path =new int[maze.length][maze[0].length];
        allpaths("",maze, 0,0,1,path);
    }

    static void allpaths(String p, boolean[][] maze, int r, int c, int recursion_number,int[][] path){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            for(int[] i: path){
                System.out.println(Arrays.toString(i));

            }
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=recursion_number;
        if(r< maze.length-1){
            allpaths(p+"D",maze,r+1, c,recursion_number+1,path);
        }
        if(c< maze[0].length-1){
            allpaths(p+"R",maze,r, c+1,recursion_number+1,path);
        }
        if(r>0){
            allpaths(p+"U", maze, r-1, c,recursion_number+1,path);
        }
        if(c>0){
            allpaths(p+"L",maze,r,c-1,recursion_number+1,path);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }
}
