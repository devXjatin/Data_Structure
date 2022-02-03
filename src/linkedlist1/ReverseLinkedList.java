package linkedlist1;

public class ReverseLinkedList {

    static Node<Integer> reverseLinkedList(Node<Integer> head){
        if(head == null){
            return head;
        }
        Node<Integer> prev = null;
        Node<Integer> forward = head.next;
        while(forward != null){
            head.next = prev;
            prev = head;
            head = forward;
            forward = forward.next;
        }
        head.next =prev;
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        head = reverseLinkedList(head);
        TakeUserInput.print(head);
    }
}
