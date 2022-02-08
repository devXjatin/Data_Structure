package generictree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {
    static Scanner scn = new Scanner(System.in);
    /*static TreeNode<Integer> takeInput(){
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
    }*/

    static TreeNode<Integer> takeInputLevelWise(){
        System.out.println("Enter root data: ");
        int rootData = scn.nextInt();
        TreeNode<Integer> root = new TreeNode<>(rootData);
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.poll();
            System.out.println("Enter the number of children of: "+frontNode.data);
            int numChild = scn.nextInt();
            for (int i = 0; i < numChild; i++) {
                System.out.println("Enter the " + (i + 1) + " Child of " + frontNode.data);
                int child = scn.nextInt();
                TreeNode<Integer> childNode = new TreeNode<>(child);
                frontNode.children.add(childNode);
                pendingNodes.add(childNode);
            }

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
        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
    }
}
