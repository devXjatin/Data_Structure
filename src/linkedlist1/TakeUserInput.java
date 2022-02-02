package linkedlist1;

import java.util.Scanner;

public class TakeUserInput {
        static Scanner scn = new Scanner(System.in);
        //take user input in linkedlist
        public static Node<Integer> takeInput(){
            Node<Integer> head = null, tail = null;
            int data = scn.nextInt();
            while(data != -1){
                Node<Integer> currentNode = new Node<>(data);
                if(head == null){
                    head=currentNode;
                    tail = currentNode;
                }else{
               /* Node<Integer> tail = head;
                while(tail.next != null){
                    tail = tail.next;
                }*/
                    tail.next = currentNode;
                    tail = currentNode;
                }
                data = scn.nextInt();
            }
            return head;
        }

        //print linkedlist
        public static void print(Node<Integer> head){
            Node<Integer> temp = head;
            while(temp != null){
                System.out.print(temp.data+"  ");
                temp = temp.next;
            }
            //next line
            System.out.println();

        }

        public static void main(String[] args) {
            Node<Integer> head = takeInput();
            print(head);
        }

}

