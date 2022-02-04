package linkedlist2;

import linkedlist1.Node;
import linkedlist1.TakeUserInput;

public class SwapTwoNode {

    static Node<Integer> swapNodes(Node<Integer> head, int i, int j){
        if(head == null || i == j){
            return head;
        }
        Node<Integer> current1Head = head, current2Head = head, prevHead1=null, prevHead2 = null;
        while(current1Head !=null && i >0){
            prevHead1 = current1Head;
            current1Head = current1Head.next;
            i--;
        }
        while (current2Head != null && j>0){
            prevHead2 = current2Head;
            current2Head = current2Head.next;
            j--;
        }
        prevHead1.next = current2Head;
        prevHead2.next = current1Head;
        current1Head.next = current2Head.next;
        current2Head.next= prevHead2;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        int i = TakeUserInput.scn.nextInt();
        int j = TakeUserInput.scn.nextInt();
        head = swapNodes(head, i, j);
        TakeUserInput.print(head);
    }
}
