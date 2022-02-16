package binarytree;

public class PrintAtDepthK {

    static void printDepthK(BinaryTreeNode<Integer> root, int k){
        if(root==null){
            return;
        }
        if (k==0){
            System.out.println(root.data);
            return;
        }
        printDepthK(root.left, k-1);
        printDepthK(root.right, k-1);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        printDepthK(root, 2);
    }
}
