package binarytree;

public class LargestNode {

    static int largestNode(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int largestLeft = largestNode(root.left);
        int largestRight = largestNode(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println("Largest Node: "+largestNode(root));
    }
}
