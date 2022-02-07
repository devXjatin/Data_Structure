package queue.queueusingll;

import stack.stackusingLL.Node;

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return front ==null;
    }

    public void enqueue(int element){

    }

    public T front(){

    }

    public T dequeue(){

    }

}
