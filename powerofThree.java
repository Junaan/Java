public class powerofThree {
    public static void main(String[] args) {
        int x=45;
        System.out.println(isPowerOfThree(x));
    }
    public static boolean isPowerOfThree(int n) {
        if(n==3 || n==1) return true;
        if(n<3) return false;
        return isPowerOfThree(n/3);
    }
}

