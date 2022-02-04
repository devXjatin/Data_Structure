package linkedlist2;

import linkedlist1.Node;
import linkedlist1.TakeUserInput;

public class EvenAfterOdd {

    static Node<Integer> evenAfterOdd(Node<Integer> head){
        if(head == null || head.next ==  null){
            return head;
        }
        Node<Integer> oddHead = null, oddTail = null, evenHead = null, evenTail = null;
        while(head != null){
            if(head.data%2==0){
                if(evenHead == null){
                    evenHead = head;
                    evenTail=head;
                }else{
                    evenTail.next = head;
                    evenTail = evenTail.next;
                }
            }else {
                if(oddHead == null){
                    oddHead = head;
                    oddTail = head;
                }else{
                    oddTail.next = head;
                    oddTail = oddTail.next;
                }
            }
            head = head.next;
        }
        if(oddHead == null){
            return evenHead;
        }else{
            oddTail.next = evenHead;
        }
        if(evenTail != null){
            evenTail.next = null;
        }
        return oddHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        head = evenAfterOdd(head);
        TakeUserInput.print(head);
    }
}
