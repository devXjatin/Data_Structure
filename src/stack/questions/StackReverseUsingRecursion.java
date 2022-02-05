package stack.questions;

import stack.stackusingLL.StackEmptyException;
import stack.stackusingLL.StackUsingLL;

public class StackReverseUsingRecursion {

    static void insertAtBottom(StackUsingLL<Integer> stack, int element) throws StackEmptyException {
        if(stack.isEmpty()){
            stack.push(element);
            return;
        }
        int item = stack.pop();
        insertAtBottom(stack, element);
        stack.push(item);
    }

    static void reverseStack(StackUsingLL<Integer> stack) throws StackEmptyException {
        if(stack.isEmpty()){
            return;
        }
        int item = stack.pop();
        reverseStack(stack);
        insertAtBottom(stack,item);
    }

    public static void main(String[] args) throws StackEmptyException {
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i*10);
        }
        reverseStack(stack);
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
