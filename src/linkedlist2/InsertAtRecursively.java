package linkedlist2;

import linkedlist1.Node;
import linkedlist1.TakeUserInput;

public class InsertAtRecursively {

    static Node<Integer> insertR(Node<Integer> head, int ele, int pos){
        if(head == null && pos>0){
            return head;
        }
        if(pos==0){
            Node<Integer> newNode = new Node<Integer>(ele);
            newNode.next = head;
            return newNode;
        }else{
            head.next = insertR(head.next, ele, pos-1);
            return head;
        }
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        head = insertR(head, 20, 2);
        TakeUserInput.print(head);
    }
}
