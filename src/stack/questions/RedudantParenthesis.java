package stack.questions;

import stack.stackusingLL.StackEmptyException;
import stack.stackusingLL.StackUsingLL;

public class RedudantParenthesis {

    static boolean findCharacter(char ch){
        if(ch =='+' || ch=='-' ||ch =='*'||ch=='/'){
            return true;
        }
        return false;
    }
    static boolean isRedundant(String expression) throws StackEmptyException {
      if(expression.equals("")){
          return false;
      }
      StackUsingLL<Character> stack = new StackUsingLL<>();
        for (int i = 0; i < expression.length(); i++) {
            if(expression.charAt(i)=='(' || findCharacter(expression.charAt(i))){
                stack.push(expression.charAt(i));
            }else if(expression.charAt(i)==')'){
                boolean hasOperator = false;
                while(!stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                    hasOperator = true;
                }
                if(!hasOperator){
                    return true;
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }

        }
        return false;
    }

    public static void main(String[] args) throws StackEmptyException {
        String expression = "((a+b))";
        System.out.println(isRedundant(expression));
    }
}
