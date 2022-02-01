package recursion3;

public class StairCase {
    static int stairCase(int num){
        if(num <0){
            return 0;
        }
        if(num==0){
            return 1;
        }
        int x = stairCase(num-1);
        int y = stairCase(num-2);
        int z = stairCase(num-3);
        return x+y+z;
    }

    public static void main(String[] args) {
        System.out.println(stairCase(4));
    }
}
