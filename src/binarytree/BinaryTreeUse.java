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

    public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentNode, boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data: ");
        }else{
            if(isLeft){
                System.out.println("Enter left child of "+parentNode);
            }else{
                System.out.println("Enter right child of "+parentNode);
            }
        }
        int rootData = scn.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild =takeTreeInputBetter(false, rootData, true);
        BinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

   public static void printDetailed(BinaryTreeNode<Integer> root){
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
        System.out.println();   //next line
        printDetailed(root.left);
        printDetailed(root.right);
    }

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root = takeTreeInput();/*/
        BinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        printDetailed(root);
    }
}
