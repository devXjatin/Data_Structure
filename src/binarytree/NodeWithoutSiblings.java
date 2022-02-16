package binarytree;

public class NodeWithoutSiblings {

    static void printWithoutSiblings(BinaryTreeNode<Integer> root){
        if(root==null){
            return;
        }
        if(root.left==null && root.right !=null){
            System.out.print(root.right.data+" ");
        }
        if(root.right==null && root.left!=null){
            System.out.print(root.left.data+" ");
        }
        printWithoutSiblings(root.left);
        printWithoutSiblings(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        printWithoutSiblings(root);
    }
}
