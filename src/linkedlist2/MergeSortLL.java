package linkedlist2;

import linkedlist1.Node;
import linkedlist1.TakeUserInput;

public class MergeSortLL {

    static Node<Integer> mergeSort(Node<Integer> head){
        if(head.next == null || head == null){
            return head;
        }
        Node<Integer> fast = head, mid = head;
        while(fast.next != null && fast.next.next != null){
            mid = mid.next;
            fast = fast.next.next;
        }
        Node<Integer> part1Head = head;
        Node<Integer> part2Head = mid.next;
        mid.next = null;
        Node<Integer> t1 = mergeSort(part1Head);
        Node<Integer> t2 = mergeSort(part2Head);
        Node<Integer> currentHead = MergeTwoSortedLL.mergeSortedLL(t1,t2);
        return currentHead;
    }


    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        head = mergeSort(head);
        TakeUserInput.print(head);
    }
}
