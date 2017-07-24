/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

import com.sun.javafx.geom.AreaOp;

/**
 *
 * @author naman.agrawal
 */
public class p20_print_all_root_to_leaves_paths {
    
    static void print_path(int[] path, int pathLen) {
        for (int i=0; i<pathLen; i++)
            System.out.print(path[i]);
        System.out.println("\n");
    }
    
    static void pathExplorer(TreeNode root, int[] path, int pathLen) {
        if (root == null)
            return;
        path[pathLen] = root.val;
        pathLen++;
        if (root.left == null && root.right == null)
            print_path(path, pathLen);
        else {
            pathExplorer(root.left, path, pathLen);
            pathExplorer(root.right, path, pathLen);
        }
    }
    
    static void printPaths(TreeNode root) {
        if (root == null)
            return;
       int[] path = new int[100];
       pathExplorer(root, path, 0);
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        printPaths(root);
    }
}
