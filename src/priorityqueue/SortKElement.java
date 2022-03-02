package priorityqueue;

import java.util.PriorityQueue;

public class SortKElement {

    private static void sortKElement(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for (;i<k;i++){
            pq.add(arr[i]);
        }
        for(;i< arr.length;i++){
            arr[i-k] = pq.remove();
            pq.add(arr[i]);
        }
        for(int j = arr.length-k; j< arr.length;j++){
            arr[j] = pq.remove();
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,9,6,8};
        int k = 3;
        sortKElement(arr, k);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
