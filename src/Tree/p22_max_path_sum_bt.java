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
public class p22_max_path_sum_bt {
    
    static int res = Integer.MIN_VALUE;
    
    static int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;
        int left = maxPathSum(root.left);
        int right = maxPathSum(root.right);
        int temp1 = Math.max(left, right);
        int temp2 = Math.max(temp1 + root.val, root.val);
        int temp3 = Math.max(temp2, left + right + root.val);
        res = Math.max(res, temp3);
        return temp3;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        maxPathSum(root);
        System.err.println(res);
    }
}
