package linkedlist2;

import linkedlist1.Node;
import linkedlist1.TakeUserInput;

public class MidPointLL {

    static Node<Integer> midPoint(Node<Integer> head){
        if(head == null){
            return head;
        }
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }

        return slow;
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        Node<Integer> midpoint = midPoint(head);
        System.out.println(midpoint.data);
    }
}
