package binarytree;

public class NodeLargestThanX {

    static int largestThanX(BinaryTreeNode<Integer> root, int x){
        if(root==null){
            return 0;
        }
        int count = root.data > x ? 1 : 0;
        if(root.left != null){
            count+= largestThanX(root.left,x);
        }
        if(root.right !=null){
            count+= largestThanX(root.right, x);
        }
        return count;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        System.out.println("Node Largest than X: "+largestThanX(root, 2));
    }
}
