package dp1;

import java.util.Arrays;

public class Fibonacci {

    static int fibM(int n){
        int[] qb = new int[n+1];
        Arrays.fill(qb, -1);
        return fibM(n, qb);
    }

    private static int fibM(int n, int[] qb){
        if(n==0 || n==1){
            qb[n] =n;
            return qb[n];
        }
        if(qb[n] != -1){
            return qb[n];
        }

        qb[n] = fibM(n-1, qb) + fibM(n-2, qb);
        return qb[n];
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(fibM(num));
    }
}
