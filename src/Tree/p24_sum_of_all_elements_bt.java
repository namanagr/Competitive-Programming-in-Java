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
public class p24_sum_of_all_elements_bt {
    
    static int sum_bt(TreeNode root) {
        if (root == null)
            return 0;
        return sum_bt(root.left) + sum_bt(root.right) + root.val;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(sum_bt(root));
    }
}
