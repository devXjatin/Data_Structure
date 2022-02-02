package linkedlist1;

import java.util.Scanner;

public class DeleteNode {
    static Node<Integer> deleteNode(Node<Integer> head, int pos){
        if(pos == 0){
            head = head.next;
            return head;
        }
        Node<Integer> temp = head;
        while(temp != null && pos-1 !=0){
            temp = temp.next;
            pos--;
        }
        if(temp == null){
            return head;
        }
        temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        int pos = TakeUserInput.scn.nextInt();
        TakeUserInput.print(head);
        head = deleteNode(head,pos);
        TakeUserInput.print(head);
    }
}
