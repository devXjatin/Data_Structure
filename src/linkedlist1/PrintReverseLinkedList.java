package linkedlist1;

public class PrintReverseLinkedList {
    //reverse linkedlist
    static void printReverse(Node<Integer> head){
        if(head == null){
            return;
        }
        printReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        printReverse(head);
    }
}
