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
public class p10_depth_of_bt {
    
    static int bt_depth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(bt_depth(root.left),bt_depth(root.right)) + 1;
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(bt_depth(root));
    }
}
