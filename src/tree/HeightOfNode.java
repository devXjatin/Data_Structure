package tree;

public class HeightOfNode {

    static int heightOfNode(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int height = 0;
        for(TreeNode<Integer> child: root.children){
            int childHeight = heightOfNode(child);
            height = Math.max(height, childHeight);
        }
        return height+1;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInputLevelWise();
        System.out.println(heightOfNode(root));
    }
}
