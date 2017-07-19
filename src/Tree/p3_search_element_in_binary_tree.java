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
public class p3_search_element_in_binary_tree {
    
    static int searchTree(TreeNode root, int search){
        if (root == null)
            return 0;
        if (root.val == search)
            return 1;
        else {
            int temp = searchTree(root.left, search);
            if (temp == 1)
                return 1;
            else
                return searchTree(root.right, search);
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
        int search = 4;
        if (searchTree(root, search) == 1)
            System.out.println("Number present in the tree");
        else
            System.out.println("Number not present in the tree");
    }
}
