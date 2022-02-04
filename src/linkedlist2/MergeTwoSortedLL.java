package linkedlist2;

import linkedlist1.Node;
import linkedlist1.TakeUserInput;

public class MergeTwoSortedLL {

    static Node<Integer> mergeSortedLL(Node<Integer> head1, Node<Integer> head2){

        Node<Integer> t1=head1, t2=head2;
        Node<Integer> head = null, tail = null;
        if(t1.data <= t2.data){
            head = t1;
            tail = t1;
            t1 = t1.next;
        }else{
            head = t2;
            tail = t2;
            t2 = t2.next;
        }
        while(t1 !=null && t2 !=null){
            if(t1.data<=t2.data){
                tail.next=t1;
                tail = tail.next;
                t1= t1.next;
            }else{
                tail.next = t2;
                tail=tail.next;
                t2=t2.next;
            }
        }

        //When t1 is exausted
        while(t2 != null){
            tail.next = t2;
            tail = tail.next;
            t2 = t2.next;
        }

        //When t2 is exausted
        while(t1 != null){
            tail.next=t1;
            t1=t1.next;
            tail = tail.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head1 = TakeUserInput.takeInput();
        Node<Integer> head2 = TakeUserInput.takeInput();
        Node<Integer> head = mergeSortedLL(head1, head2);
        TakeUserInput.print(head);
    }
}
