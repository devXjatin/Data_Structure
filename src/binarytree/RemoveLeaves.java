package binarytree;

public class RemoveLeaves {

    static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        if(root.left ==null && root.right==null){
            return null;
        }
        root.left=removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        BinaryTreeNode<Integer> newRoot = removeLeaves(root);
        BinaryTreeUse.printDetailed(newRoot);
    }
}
