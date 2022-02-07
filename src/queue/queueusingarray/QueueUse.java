package queue.queueusingarray;

public class QueueUse {
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(3);
        int[] arr = {10,20, 30, 40, 50};
        for(var ele : arr){
            queue.enqueue(ele);
        }
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }

    }
}
