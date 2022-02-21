package binarysearchtree;

import binarytree.BinaryTreeNode;
import binarytree.BinaryTreeUse;

public class PrintBetweenK1K2 {

    static void printBetweenK1K2(BinaryTreeNode<Integer> root , int k1, int k2){
        if(root==null){
            return;
        }
        if(root.data <k1){
            printBetweenK1K2(root.left,k1, k2);
        }else if(root.data>k2){
            printBetweenK1K2(root.right,k1, k2);
        }else{
            System.out.println(root.data+" ");
            printBetweenK1K2(root.left,k1, k2);
            printBetweenK1K2(root.right, k1, k2);
        }

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        printBetweenK1K2(root, 6,10);
    }
}
