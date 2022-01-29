package recursion1;

public class CalculatePower {
    static int calculatePower(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * calculatePower(3, n-1);
    }

    public static void main(String[] args) {
        int value = 3;
        int power = 4;
        System.out.println(calculatePower(3,4));
    }
}
