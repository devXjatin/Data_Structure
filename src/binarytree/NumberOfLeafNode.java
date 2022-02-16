package binarytree;

public class NumberOfLeafNode {

    static int leafNode(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        return 1+Math.max(leafNode(root.left),leafNode(root.right));
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println("Number of Leaf Node: "+leafNode(root));
    }
}
