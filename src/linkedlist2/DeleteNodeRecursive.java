package linkedlist2;

import linkedlist1.Node;
import linkedlist1.TakeUserInput;

public class DeleteNodeRecursive {
    static Node<Integer> deleteNodeR(Node<Integer> head, int pos){
        if(head == null && pos>0){
            return head;
        }
        if(pos == 0){
            return head.next;
        }else{
            head.next = deleteNodeR(head.next, pos-1);
            return head;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        int pos = TakeUserInput.scn.nextInt();
        head = deleteNodeR(head, pos);
        TakeUserInput.print(head);
    }
}
