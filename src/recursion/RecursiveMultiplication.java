package recursion;

public class RecursiveMultiplication {
    static int recursiveMultiplication(int x, int y){
        if(y==0){
            return 0;
        }
        return x+recursiveMultiplication(x,y-1);
    }

    public static void main(String[] args) {
        int x = 3, y = 4;
        System.out.println(recursiveMultiplication(x,y));
    }
}
