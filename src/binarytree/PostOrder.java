package binarytree;

public class PostOrder {
    static void printPostOrder(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        printPostOrder(root);
    }
}
