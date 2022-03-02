package priorityqueue;

import java.util.PriorityQueue;

public class PrintKLargest {

    private static void printKLargest(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i =0;
        while(i<k){
            pq.add(arr[i]);
            i++;
        }
        while(i<arr.length){
            int min = pq.element();
            if(arr[i]> min){
                pq.remove();
                pq.add(arr[i]);
            }
            i++;
        }
        while (!pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 15, 8, 9, 12, 12, 20};
        printKLargest(arr, 3);
    }
}
