package binarytree;

public class CreateInsertDuplicate {

    static void insertDuplicate(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> rootLeft = root.left;
        root.left = newNode;
        newNode.left = rootLeft;
        insertDuplicate(rootLeft);
        insertDuplicate(root.right);

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        insertDuplicate(root);
        BinaryTreeUse.printDetailed(root);
    }
}
