package linkedlist1;

public class InsertLinkedList {

    //insert linkedList
    static void insertLinkedList(Node<Integer> head, int i, Node<Integer> currentNode){
        Node<Integer> temp = head;

        while(temp.next !=null && i-1 !=0){
            temp = temp.next;
            i--;
        }
        currentNode.next = temp.next;
        temp.next = currentNode;
    }



    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        TakeUserInput.print(head);
        insertLinkedList(head, 3, new Node<>(60));
        TakeUserInput.print(head);
    }
}
