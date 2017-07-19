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
public class p2_max_element_wihtout_recursoin {
    static void findMax(TreeNode root){
        if (root == null)
            return;
        int max_num = Integer.MIN_VALUE;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while (!q.isEmpty()){
            TreeNode temp = q.remove();
            if (temp.val > max_num)
                max_num = temp.val;
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
        System.out.println(max_num);
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        findMax(root);   
    }
}
