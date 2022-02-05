package stack.questions;

import stack.stackusingLL.StackEmptyException;
import stack.stackusingLL.StackUsingLL;

public class BalancedParanthesis {

    static boolean isBalanced(String expression) throws StackEmptyException {
        if(expression.equals("")){
            return true;
        }
        StackUsingLL<Character> stack = new StackUsingLL<>();
        for (int i = 0; i <expression.length() ; i++) {
            if(expression.charAt(i) == '('){
                stack.push(expression.charAt(i));
            }else if(expression.charAt(i)==')'){
                if(stack.isEmpty()){
                    return false;
                }
                char topOfChar = stack.pop();
                if(expression.charAt(i)==')' && topOfChar=='('){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) throws StackEmptyException {
        String expression = "(()())";
        System.out.println(isBalanced(expression));
    }
}
