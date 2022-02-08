package tree;

import java.util.Scanner;

public class TreeUse {
    static Scanner scn = new Scanner(System.in);
    static TreeNode<Integer> takeInput(){
        System.out.println("Enter the new node data: ");
        int n = scn.nextInt();
        TreeNode<Integer> root = new TreeNode<>(n);
        System.out.println("Enter number of children for: "+n);
        int childCount = scn.nextInt();
        for (int i = 0; i < childCount; i++) {
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
            
        }
        return root;
    }

    //print tree
    static void print(TreeNode<Integer> root){
        String s = root.data+ ": ";
        for (int i = 0; i <root.children.size(); i++) {
            s+= root.children.get(i).data+",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }
    
    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        print(root);
    }
}
