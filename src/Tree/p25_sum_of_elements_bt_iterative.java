/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;
import java.util.*;
/**
 *
 * @author naman.agrawal
 */
public class p25_sum_of_elements_bt_iterative {
    
    static int sum_bt(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int sum = 0;
        while (!q.isEmpty()) {
            TreeNode front = q.remove();
            sum += front.val;
            if (front.left != null)
                q.add(front.left);
            if (front.right != null)
                q.add(front.right);
        }
        return sum;
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
