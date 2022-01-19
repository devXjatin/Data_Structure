package arrays;

public class TrappingRainWater {

    //method to find left max Boundary
    static int leftMaxBoundary(int[] arr, int n, int i){
        int maximum = 0;
        for (int j = 0; j <= i; j++) {
            maximum = Math.max(maximum, arr[j]);
        }
        return maximum;
    }

    //method to find right max Boundary
    static int rightMaxBoundary(int[] arr, int n, int i){
        int maximum = 0;
        for (int j = n-1; j >=i; j--) {
            maximum = Math.max(maximum, arr[j]);
        }
        return maximum;
    }

    //method to find total water trap
    static int findTotalWater(int[] arr, int n){
        int ans = 0;
        for (int i = 1; i < n-1; i++) { // ignoring the 1st (0th) and last(n-1) index
            int leftMax = leftMaxBoundary(arr, n, i);
            int rightMax = rightMaxBoundary(arr, n, i);
            ans = ans + Math.min(leftMax, rightMax) - arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {3, 0, 2, 0, 4};
        System.out.println(findTotalWater(arr, 5));
    }
}
