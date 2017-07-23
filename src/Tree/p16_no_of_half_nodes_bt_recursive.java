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
public class p16_no_of_half_nodes_bt_recursive {
    
    static int no_of_halfnodes(TreeNode root) {
        if (root == null)
            return 0;
        int x = 0;
        if ((root.left != null && root.right == null) || (root.left == null && root.right != null))
            x = 1;
        return no_of_halfnodes(root.left) + no_of_halfnodes(root.right) + x;
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        //root.right.right = new TreeNode(7);
        System.out.println(no_of_halfnodes(root));
    }
}
