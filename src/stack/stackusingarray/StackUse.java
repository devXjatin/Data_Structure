package stack.stackusingarray;

import java.util.Scanner;

public class StackUse {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) throws StackFullException {
        int sizeOfStack = scn.nextInt();
        StackUsingArray stack = new StackUsingArray(sizeOfStack);
        int[] arr = {5, 6, 1, 4, 3,8};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
