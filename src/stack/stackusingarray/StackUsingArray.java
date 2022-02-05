package stack.stackusingarray;

public class StackUsingArray {
    private int[] data;
    private int topIndex;

    public StackUsingArray(int sizeOfStack){
        data = new int[sizeOfStack];
        topIndex = -1;
    }

    //size of stack
    public int size(){
        return topIndex+1;
    }

    //check whether stack is empty or not
    public boolean isEmpty(){
        return topIndex == -1;
    }

    //Push element in the stack
    public void push(int element) throws StackFullException {
        if(topIndex == data.length-1){
            doubleCapcity();
        }
        data[topIndex+1]=element;
        topIndex++;
    }

    private void doubleCapcity(){
        int[] temp = data;
        data = new int[2*temp.length];
        for(int i = 0;i< temp.length;i++){
            data[i] = temp[i];
        }
    }

    //return element at top of stack
    public int peek(){
        if(isEmpty()){
            return topIndex;
        }else{
            return data[topIndex];
        }
    }

    //remove element at top of stack
    public int pop(){
        if(isEmpty()){
            return topIndex;
        }else{
            int remove = data[topIndex];
            topIndex--;
            return remove;
        }
    }



}
