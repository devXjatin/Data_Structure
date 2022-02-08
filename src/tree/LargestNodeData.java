package tree;

public class LargestNodeData {
    static int largestData(TreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int ans = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int childLargest = largestData(root.children.get(i));
            if(childLargest > ans){
                ans = childLargest;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = TreeUse.takeInputLevelWise();
        System.out.println(largestData(root));
    }
}
