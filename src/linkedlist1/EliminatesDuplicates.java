package linkedlist1;

public class EliminatesDuplicates {

    //eliminates duplicate from linkedlist
    static Node<Integer> eliminatesDuplicates(Node<Integer> head){
        if(head == null){
            return head;
        }
        Node<Integer> temp = head;
        while (temp.next != null){
            if(temp.data.equals(temp.next.data)){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        head = eliminatesDuplicates(head);
        TakeUserInput.print(head);
    }
}
