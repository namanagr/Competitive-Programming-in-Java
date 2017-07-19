/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;
import java.util.Stack;

/**
 *
 * @author naman.agrawal
 */
public class a1b_tree_traversal_without_recursion {
    static void preorder_traversal(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> stk1 = new Stack();
        stk1.push(root);
        while (!stk1.isEmpty()){
            TreeNode node = stk1.pop();
            System.out.println(node.val);
            if (node.right != null) 
                stk1.push(node.right);
            if (node.left != null)
                stk1.push(node.left);
        }

    }
    
    static void inorder_traversal(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> stk1 = new Stack();
        stk1.push(root);
        while(!stk1.isEmpty()){
            TreeNode node = stk1.pop();
        }
    }
    
    static void postorder_traversal(TreeNode root){
        if (root == null)
            return;
        Stack<TreeNode> stk1 = new Stack();
        stk1.push(root);
        while(!stk1.isEmpty()){
            TreeNode node = stk1.pop();
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
        System.out.println("Preorder traversal..");
        preorder_traversal(root);
        //System.out.println("Inorder traversal..");
        //preorder_traversal(root);
        //System.out.println("Postorder traversal..");
        //ptorder_traversal(root);
    }
}
