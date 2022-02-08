package tree;

public class FindNumberOfNodes {

    public static int countNumberOfNodes(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        int count = 1;
        for (int i = 0; i < root.children.size(); i++) {
            count+= countNumberOfNodes(root.children.get(i));
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInputLevelWise();
        System.out.println(countNumberOfNodes(root));
    }

}
