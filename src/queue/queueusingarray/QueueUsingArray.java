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
        if(size == data.length){
            doubleCapacity();
        }
        if(isEmpty()){
            front = 0;
        }
        rear = (rear+1)%data.length;    //circular queue
        data[rear] = element;
        size++;

    }

    private void doubleCapacity(){
        int[] temp = data;
        data = new int[2* temp.length];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index++]= temp[i];
        }
        for (int i = 0; i < front-1; i++) {
            data[index++] = temp[i];

        }
        front = 0;
        rear = temp.length-1;
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
        front=(front+1)% data.length;   //circular queue
        size--;
        if(size == data.length){
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
