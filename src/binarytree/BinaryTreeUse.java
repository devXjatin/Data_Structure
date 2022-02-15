package binarytree;

import java.util.Scanner;

public class BinaryTreeUse {
    final static Scanner scn = new Scanner(System.in);

    static BinaryTreeNode<Integer> takeTreeInput(){
        System.out.println("Enter root data: ");
        int rootData = scn.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild = takeTreeInput();
        BinaryTreeNode<Integer> rightChild = takeTreeInput();
        root.left = leftChild;
        root.right=rightChild;
        return root;

    }

    static void printDetailed(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        System.out.print(root.data+": ");
        if(root.left !=null){
            System.out.print("L"+root.left.data+",");
        }
        if(root.right !=null){
            System.out.print("R"+root.right.data);
        }
        printDetailed(root.left);
        printDetailed(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeTreeInput();
        printDetailed(root);
    }
}
