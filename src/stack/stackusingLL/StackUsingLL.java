package stack.stackusingLL;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;

    //return size of the stack
    public int size(){
        return size;
    }

    //check whether stack is empty or not
    public boolean isEmpty(){
        return size==0 || head==null;
    }

    //push or insert element in the stack
    public void push(T element){
        Node<T> newNode = new Node<T>(element);
            newNode.next = head;
            head = newNode;
            size++;
    }

    //return element at top of stack
    public T peek() throws StackEmptyException{
        if(isEmpty()){
            throw new StackEmptyException();
        }
        return head.data;
    }

    //remove the element at top of stack and return the value
    public T pop() throws StackEmptyException {
        if(isEmpty()){
            throw new StackEmptyException();
        }
        T temp = head.data;
        head = head.next;
        return temp;
    }

}
