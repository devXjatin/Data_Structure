package queue.queueusingll;

import linkedlist1.Node;

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
        return front ==null && rear ==null;
    }

    public void enqueue(T element){
        Node<T> newNode = new Node<T>(element);
        size++;
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T front(){
        if(isEmpty()){
            throw new NullPointerException();
        }
        return front.data;
    }

    public T dequeue(){
        if(isEmpty()){
            throw new NullPointerException();
        }
        T temp = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        size--;
        return temp;
    }

}
