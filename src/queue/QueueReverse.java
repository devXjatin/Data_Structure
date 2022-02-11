package queue;

import java.util.*;

public class QueueReverse<T> {
    public static void queueReverse(Queue<Integer> queue){
        if(queue.size() == 0){
            return;
        }
        int temp = queue.poll();
        queueReverse(queue);
        queue.add(temp);
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40, 50};
        Queue<Integer> queue = new LinkedList<>();
        for(var element: arr){
            queue.add(element);
        }
        queueReverse(queue);

        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }
    }
}
