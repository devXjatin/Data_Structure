package linkedlist1;

public class InsertLinkedList {

    //insert linkedList
    static Node<Integer> insertLinkedList(Node<Integer> head, int i, Node<Integer> currentNode){

        if(i == 0){
            currentNode.next = head;
            head = currentNode;
            return head;
        }

        Node<Integer> temp = head;

        while(temp !=null && i-1 !=0){
            temp = temp.next;
            i--;
        }
        if(temp == null){
            return head;
        }
        currentNode.next = temp.next;
        temp.next = currentNode;
        return head;
    }



    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        TakeUserInput.print(head);
        insertLinkedList(head, 3, new Node<>(60));
        TakeUserInput.print(head);
    }
}
