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
public class p17b_identical_bt {
    
    static boolean identical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null)
            return true;
        else if (root1 != null && root2 != null)
            return (root1.val == root2.val) & identical(root1.left, root2.left) & identical(root1.right, root2.right);
        else
            return false;
    }
    
    public static void main(String[] args){
        // tree1
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        //root.right.right = new TreeNode(7);
        // tree2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        
        System.out.println(identical(root,root2));
    }
}
    
