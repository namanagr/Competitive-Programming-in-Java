/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package competitive.programming.Leetcode;

/**
 *
 * @author naman.agrawal
 */
public class l104_max_depth_binary_tree {
    
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x){
            val = x;
        }                
    }
    
    public static int maxDepth (TreeNode root){
        if (root == null)
            return 0;
        else
            return Math.max(maxDepth(root.left), maxDepth(root.right) + 1);
    }
    
    public static void main (String[] args){
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(3);
        root.right = new TreeNode(10);
        System.out.println(maxDepth(root));
    }
}
