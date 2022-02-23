package binarysearchtree;

import binarytree.BinaryTreeNode;
import binarytree.BinaryTreeUse;

public class LowestCommonAncestor {

    static BinaryTreeNode<Integer> lowestCommonAncestor(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> p,
                                                        BinaryTreeNode<Integer> q){
        if(root == null){
            return null;
        }
        if(root.data >p.data && root.data>q.data){
            return lowestCommonAncestor(root.left, p,q);
        }
        if(root.data < p.data && root.data < q.data){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = BinaryTreeUse.takeTreeInputBetter(true, 0, true);
        BinaryTreeNode<Integer>lca = lowestCommonAncestor(root, new BinaryTreeNode<>(2),new BinaryTreeNode<>(5));
        System.out.println(lca.data);
    }
}
