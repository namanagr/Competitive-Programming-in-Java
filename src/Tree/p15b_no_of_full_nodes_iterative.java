/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;
import java.util.*;
/**
 *
 * @author namanagr
 */
public class p15b_no_of_full_nodes_iterative {
    
    static int no_of_fullnodes(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList();
        int fullnodes = 0;
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode front = q.remove();
            if (front.left != null && front.right != null)
                fullnodes++;
            if (front.left != null)
                q.add(front.left);
            if (front.right != null)
                q.add(front.right);
        }
        return fullnodes;
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(no_of_fullnodes(root));
    } 
}
