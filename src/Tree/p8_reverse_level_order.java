package Tree;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author namanagr
 */

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Stack;

public class p8_reverse_level_order {
    
    static ArrayList<Integer> levelorder_reverse(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> q = new LinkedList();
        Stack<Integer> st = new Stack();
        Stack<Integer> temp = new Stack();
        ArrayList<Integer> res = new ArrayList();
        q.add(root);
        st.push(root.val);
        while (!q.isEmpty()) {
            TreeNode front = q.remove();
            if (front.left != null) {
                q.add(front.left);
                temp.push(front.left.val);
            }
            if (front.right != null) {
                q.add(front.right);
                temp.push(front.right.val);
            }
            while (!temp.isEmpty()) {
                st.push(temp.pop());
            }
        }
        while (!st.isEmpty())
            res.add(st.pop());
        return res;
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(levelorder_reverse(root));
    }
}
