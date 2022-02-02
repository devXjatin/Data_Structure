package linkedlist1.takeinput;

import java.util.Scanner;

public class LinkedListUse {
    static Scanner scn = new Scanner(System.in);
    //take user input in linkedlist
    static Node<Integer> takeInput(){
        Node<Integer> head = null;
        int data = scn.nextInt();
        while(data != -1){
            Node<Integer> currentNode = new Node<>(data);
            if(head == null){
                head=currentNode;
            }else{
                Node<Integer> tail = head;
                while(tail.next != null){
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = scn.nextInt();
        }
        return head;
    }

    //print linkedlist
    static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        print(head);
    }
}
