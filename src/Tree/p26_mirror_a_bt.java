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
public class p26_mirror_a_bt {
    
    static void mirror(TreeNode root) {
        if (root == null)
            return;
        mirror(root.left);
        mirror(root.right);
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        mirror(root);
    }
}
