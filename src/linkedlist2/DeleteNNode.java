package linkedlist2;

import linkedlist1.Node;
import linkedlist1.TakeUserInput;

public class DeleteNNode {

    static Node<Integer> deleteNNode(Node<Integer> head, int n, int m){
        if(m== 0 || head == null){
            return null;
        }
        if(n== 0){
            return head;
        }
        Node<Integer> currentHead = head, temp = null;

        while(currentHead != null){
            int take = 0;
            int skip = 0;
            while (currentHead != null && take<n){
                if(temp == null){
                    temp = currentHead;

                }else{
                    temp.next = currentHead;
                    temp = currentHead;
                }
                currentHead = currentHead.next;
                take++;
            }
            while (currentHead != null && skip <m){
                currentHead = currentHead.next;
                skip++;
            }
        }
        if(temp.next != null){
            temp.next = null;
        }
        return head;

    }

    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        int n = TakeUserInput.scn.nextInt();
        int m = TakeUserInput.scn.nextInt();
        head = deleteNNode(head,n,m);
        TakeUserInput.print(head);
    }
}
