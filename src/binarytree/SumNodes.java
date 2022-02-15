package binarytree;

public class SumNodes {

    static int sumNodes(BinaryTreeNode<Integer>root){
        if(root == null){
            return 0;
        }
        int leftSum = sumNodes(root.left);
        int rightSum= sumNodes(root.right);
        return root.data+leftSum+rightSum;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true,0,true);
        System.out.println("Sum of Nodes: "+sumNodes(root));
    }
}
