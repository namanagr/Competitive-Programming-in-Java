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
public class p1_max_element_in_binary_tree {
    static int findMax(TreeNode root){
        if (root == null)
            return Integer.MIN_VALUE;
        int lmax = findMax(root.left);
        int rmax = findMax(root.right);
        int temp = Math.max(lmax, rmax);
        return Math.max(root.val, temp);
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println("Max element " + findMax(root));
        
    }
}
