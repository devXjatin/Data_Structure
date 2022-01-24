package arrays;

import java.util.ArrayList;

public class StockBuySell {
    static ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        for(int i  = 1; i < n; i++){
            ArrayList<Integer> temp = new ArrayList();
            if(A[i - 1] < A[i]){
                temp.add(i - 1);
                temp.add(i);
                ans.add(temp);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12};
        ArrayList<ArrayList<Integer>> a = stockBuySell(arr, arr.length);
        System.out.println(a);
    }
}
