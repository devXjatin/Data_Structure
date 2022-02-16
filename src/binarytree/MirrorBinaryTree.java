package binarytree;

public class MirrorBinaryTree {

    static void mirror(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        mirror(root.left);
        mirror(root.right);
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right=temp;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        BinaryTreeUse.printDetailed(root);
        mirror(root);
        BinaryTreeUse.printDetailed(root);

    }
}
