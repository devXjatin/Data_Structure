package stack.stackusingLL;

public class StackUse {
    public static void main(String[] args) throws StackEmptyException {
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        int[] arr = {5, 6, 1, 4, 3,8};
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
