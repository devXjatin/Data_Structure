package queue.queueusingll;

public class QueueUseLL {
    public static void main(String[] args) {
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        int[] arr = {10, 20, 30, 40, 50};
        for(var elem:arr){
            queue.enqueue(elem);
        }
        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
