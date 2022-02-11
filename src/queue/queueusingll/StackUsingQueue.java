package queue.queueusingll;

import java.util.*;

public class StackUsingQueue<T> {
    private Queue<T> queue1;
    private Queue<T> queue2;
    private int size;

    public StackUsingQueue(){
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(T element){
        while(!queue1.isEmpty()){
            queue2.add(queue1.poll());
        }

        queue1.add(element);
        size++;
        while (!queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
    }
    public T peek(){
        return queue1.peek();
    }

    public T pop(){
        size--;
        return queue1.poll();

    }

    public static void main(String[] args) {
        StackUsingQueue<Integer> stack = new StackUsingQueue<>();
        int[] arr = {10, 20, 30, 40, 50};
        for(var ele:arr){
            stack.push(ele);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
