package linkedlist2;

import linkedlist1.Node;
import linkedlist1.TakeUserInput;

public class KReverseNodes {

    static Node<Integer> kReverse(Node<Integer>head, int k){
        if(head == null|| k==0){
            return head;
        }
        int count = 0;
        Node<Integer> curr=head, prev=null, temp =null;
        while(curr != null && count <k){
            temp=curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            count++;
        }
        if(temp != null){
            head.next = kReverse(temp, k);
        }
        return prev;
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        head = kReverse(head, 3);
        TakeUserInput.print(head);
    }
}
