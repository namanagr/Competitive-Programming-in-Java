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
public class p18_diameter_of_a_bt {
    
    static int depth_bt(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(depth_bt(root.left), depth_bt(root.right)) + 1;
    }
    
    static int diagonal_bt(TreeNode root) {
        if (root == null)
            return 0;
        int left_depth = depth_bt(root.left);
        int right_depth = depth_bt(root.right);
        int left_diagonal = diagonal_bt(root.left);
        int right_diagonal = diagonal_bt(root.right);
        return Math.max((left_depth + right_depth + 1), Math.max(left_diagonal, right_diagonal));
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(diagonal_bt(root));
    }
}
