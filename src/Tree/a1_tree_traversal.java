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
public class a1_tree_traversal {

    static void preorder_traversal(TreeNode root){
        if (root != null){
            System.out.println(root.val);
            preorder_traversal(root.left);
            preorder_traversal(root.right);
        }
    }
    
    static void inorder_traversal(TreeNode root){
        if (root != null){
            inorder_traversal(root.left);
            System.out.println(root.val);
            inorder_traversal(root.right);
        }
    }
    
    static void postorder_traversal(TreeNode root){
        if (root != null){
            postorder_traversal(root.left);
            postorder_traversal(root.right);
            System.out.println(root.val);
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
        System.out.println("Inorder traversal..");
        inorder_traversal(root);
        System.out.println("Postorder traversal..");
        postorder_traversal(root);
    }
}
