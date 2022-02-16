package binarytree;

public class IsNodePresent {

    static boolean isNodePresent(BinaryTreeNode<Integer> root, int k){
        if(root==null){
            return false;
        }
        if(root.data.equals(k)){
            return true;
        }
        return isNodePresent(root.left, k) || isNodePresent(root.right,k);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println("Node Present: "+isNodePresent(root, 7));
    }
}
