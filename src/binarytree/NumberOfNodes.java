package binarytree;

public class NumberOfNodes {

    static int countNumberOfNodes(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        return 1+countNumberOfNodes(root.left)+countNumberOfNodes(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println(countNumberOfNodes(root));
    }
}
