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
public class p23_search_path_given_sum {
    
    static boolean hasSum(TreeNode root, int providedSum, int currentSum) {
        if (root == null)
            return providedSum == currentSum;
        currentSum += root.val;
        boolean left = hasSum(root.left, providedSum, currentSum);
        boolean right = hasSum(root.right, providedSum, currentSum);
        return left | right;
        
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(hasSum(root,7,0));
    }
}
