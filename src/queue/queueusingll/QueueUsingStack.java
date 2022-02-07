package queue.queueusingll;

import java.util.*;

public class QueueUsingStack<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;
    private int size;
    public QueueUsingStack(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size ==0;
    }

    public void enqueue(T element){
       stack1.push(element);
       size++;
    }

    public T peek(){
        while(!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }
        T ans = stack2.peek();
        while (!stack2.isEmpty()){
            stack1.add(stack2.pop());
        }
        return ans;
    }

    public T dequeue(){
        while(stack1.size()>1){
            stack2.add(stack1.pop());
        }
        T ans = stack1.pop();
        size--;
        while (!stack2.isEmpty()){
            stack1.add(stack2.pop());
        }
        return ans;
    }

    public static void main(String[] args) {
        QueueUsingStack<Integer> queue = new QueueUsingStack<>();
        int[] arr = {10, 20, 30, 40, 50};
        for(var ele:arr){
            queue.enqueue(ele);
        }
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }

}
