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

import java.util.Queue;
import java.util.LinkedList;

public class p4_search_bt_iterative {
    
    static boolean searchTree(TreeNode root, int item) {
        if (root == null)
            return false;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode front = q.remove();
            if (front.val == item)
                return true;
            if (front.left != null)
                q.add(front.left);
            if (front.right != null)
                q.add(front.right);
        }
        return false;
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int search = 4;
        if (searchTree(root, search) == true)
            System.out.println("Number present in the tree");
        else
            System.out.println("Number not present in the tree");
    }
}
