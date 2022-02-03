package linkedlist1;

public class FindNode {

    //find node in linkedlist
    static int findNode(Node<Integer> head, int element){
        int pos = -1;
        Node<Integer> temp = head;
        if(head == null){
            return -1;
        }
        while (temp != null && temp.data != element){
            temp  = temp.next;
            ++pos;
        }
        if(temp == null){
            return -1;
        }
        return ++pos;

    }

    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        int element = TakeUserInput.scn.nextInt();
        System.out.println(findNode(head, element));
    }
}
