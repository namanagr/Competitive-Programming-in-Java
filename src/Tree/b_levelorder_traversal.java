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
public class b_levelorder_traversal {
    
    static void levelorder_traverse(TreeNode root){
        if (root == null)
            return;
        ArrayList<Integer> result = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode front = queue.remove();
            result.add(front.val);
            if (front.left != null)
                queue.add(front.left);
            if (front.right != null)
                queue.add(front.right);
        }
        for (int num : result){
            System.out.println(num);
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
        levelorder_traverse(root);
    }
}
