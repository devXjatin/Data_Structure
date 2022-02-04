package linkedlist2;

import linkedlist1.Node;
import linkedlist1.TakeUserInput;

public class ReverseLLRecursive {
    static Node<Integer> reverseRecursive(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }
        Node<Integer> smallHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return smallHead;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        head = reverseRecursive(head);
        TakeUserInput.print(head);
    }
}
