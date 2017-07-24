/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author naman.agrawal
 */
public class p28_lca_2_nodes_bt {
    
    static TreeNode lca(TreeNode root, TreeNode root1, TreeNode root2) {
        if (root == null)
            return null;
        if (root.val == root1.val || root.val == root2.val)
            return root;
        TreeNode left = lca(root.left, root1, root2);
        TreeNode right = lca(root.right, root1, root2);
        if (left != null && right != null) // nodes present on left and right, hence lca is root
            return root;
        return left != null ? left : right;
    }
            
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        TreeNode common = lca(root, root.left, root.left.left);
        if (common != null)
            System.out.println(common.val);
        else
            System.out.println("LCA does not exist.");
    }
}
