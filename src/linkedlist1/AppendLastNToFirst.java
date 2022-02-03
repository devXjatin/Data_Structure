package linkedlist1;

public class AppendLastNToFirst {

    //append last n to first
    static Node<Integer> appendLastNToFirst(Node<Integer> head, int n){
        if(n == 0 || head == null){
            return head;
        }
        Node<Integer> fast = head;
        Node<Integer> slow = head;
        Node<Integer> initalHead = head;
        for (int i = 0; i<n; i++){
            fast = fast.next;
        }
        while (fast.next != null){
            slow= slow.next;
            fast = fast.next;
        }
        Node<Integer> temp = slow.next;
        slow.next = null;
        fast.next = initalHead;
        head = temp;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        int pos = TakeUserInput.scn.nextInt();
        head = appendLastNToFirst(head, pos);
        TakeUserInput.print(head);
    }
}
