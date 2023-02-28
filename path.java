public class path {
    public static void main(String[] args) {
        boolean[][] matrix ={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        //pathlist("", 3,3);
        blockedpath("",matrix,0,0);

    }


        //now placing a block at 1,1 means you cannot go through it;
        static void blockedpath(String p, boolean[][] matrix, int r, int c){
            if(r == matrix.length-1 && c==matrix[0].length-1){
                System.out.println(p);
                return;
            }
            if(matrix[r][c]==false){
                return;
            }
            if(r < matrix.length-1){
                blockedpath(p+"D",matrix,r+1, c);
            }
            if(c<matrix[1].length-1){
                blockedpath(p+'R',matrix,r,c+1);
            }
        }

        static void pathlist(String p, int r, int c){
            if( r==1 && c==1){
                System.out.println(p);
                return;
            }
            if(r>1){
                pathlist(p+"D",r-1,c);
            }
            if(c>1){
                pathlist(p+"R", r, c-1);
            }
        }
}
