package binarytree;

public class DiameterOfBinaryTree {

    static int diameter(BinaryTreeNode<Integer> root){
        int[] diameter = new int[1];
        diameterHeight(root, diameter);
        return diameter[0];
    }
    private static int diameterHeight(BinaryTreeNode<Integer> root, int[] diameter){
        if(root == null){
            return 0;
        }
        int lh = diameterHeight(root.left, diameter);
        int rh = diameterHeight(root.right, diameter);
        diameter[0] = Math.max(diameter[0],lh+rh);
        return 1+Math.max(lh,rh);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println("Diameter of Binary tree: "+diameter(root));
    }
}
