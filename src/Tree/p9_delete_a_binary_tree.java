/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author namanagr
 */
public class p9_delete_a_binary_tree {
    
    static void bt_del(TreeNode root) {
        if (root == null)
            return;
        bt_del(root.left);
        bt_del(root.right);
        root = null;
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        bt_del(root);
    }
}
