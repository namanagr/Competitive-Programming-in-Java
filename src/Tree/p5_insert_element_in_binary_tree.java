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
public class p5_insert_element_in_binary_tree {
    static void bt_insert(TreeNode root, int item) {
        if (root == null)
            root = new TreeNode(item);
        else {
            Queue<TreeNode> q = new LinkedList();
            q.add(root);
            while(!q.isEmpty()) {
                TreeNode front = q.remove();
                if (front.left == null){
                    front.left = new TreeNode(item);
                    break;
                }
                else {
                    q.add(front.left);
                }
                if (front.right == null){
                    front.right = new TreeNode(item);
                    break;
                }
                else {
                    q.add(front.right);
                }
            }
        }
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        bt_insert(root, 10);
    }
}
