package linkedlist1;

public class PalindromeLinkedlist {
    static Node<Integer> pLeft = null;
    static boolean isPalindromeLL(Node<Integer> right){
        if(right == null){
            return true;
        }
        boolean recursiveResponse = isPalindromeLL(right.next);
        if(!recursiveResponse){
            return false;
        }else if(pLeft.data != right.data){
            return false;
        }else{
            pLeft = pLeft.next;
            return true;
        }

    }
        static boolean isPalindrome(Node<Integer> head){
            pLeft = head;
       return isPalindromeLL(head);
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeUserInput.takeInput();
        boolean isPLL = isPalindrome(head);
        System.out.println(isPLL);
    }
}
