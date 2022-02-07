package queue.queueusingarray;

public class QueueUsingArray {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray(){
        data = new int[5];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0 || front == -1;
    }

    public void enqueue(int element){
        if(isEmpty()){
            front = 0;
        }
        rear++;
        data[rear] = element;
        size++;

    }

    public int front(){
        if(isEmpty()){
            return -1;
        }
        return data[front];
    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int temp = data[front];
        front++;
        size--;
        if(size == data.length){
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
