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
public class p19_max_sum_level_bt {
    
    static int max_sum_level(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int level = 1;
        int levelmax = Integer.MIN_VALUE;
        int summax = 0;
        while (true) {
           int nodecount = q.size();
           if (nodecount == 0)
               break;
           int sum = 0;
           while (nodecount > 0) {
               TreeNode front = q.remove();
               sum += front.val;
               if (front.left != null)
                   q.add(front.left);
               if (front.right != null)
                   q.add(front.right);
               nodecount--;
           }
           if (sum > summax) {
               summax = sum;
               levelmax = level;
           }
           level++;
        }
        return levelmax;
    }
    
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        System.out.println(max_sum_level(root));
    }
}
