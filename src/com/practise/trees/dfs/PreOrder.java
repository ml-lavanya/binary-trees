package com.practise.trees.dfs;

import com.practise.trees.basic.TreeNode;

/*
Algorithm for Preorder Traversal:
 Visit the root.
 Traverse the left subtree, i.e., call Preorder(left->subtree)
 Traverse the right subtree, i.e., call Preorder(right->subtree)
 */
public class PreOrder {
    static void preOrderTraversal(TreeNode root){
        if(root == null) return;
        // visit the root
        System.out.print(root.val + "->");
        // traverse the left sub tree
        if (root.left != null){
            preOrderTraversal(root.left);
        }
        // traverse the right sub tree
        if(root.right != null){
            preOrderTraversal(root.right);
        }
    }

    static TreeNode createSampleTree(){
        TreeNode grandLeftChild = new TreeNode(4);
        TreeNode grandRightChild = new TreeNode(5);
        TreeNode grandChildRightRight = new TreeNode(6);
        TreeNode leftChild = new TreeNode(2, grandLeftChild, grandRightChild);
        TreeNode rightChild = new TreeNode(3, null, grandChildRightRight);
        return new TreeNode(1, leftChild, rightChild);
    }
    public static void main(String[] args) {
        TreeNode root = createSampleTree();
        System.out.printf("Binary Tree:: %1$s %n DFS: pre order traversal of the tree:: %n ", root.toString());
        preOrderTraversal(root);
    }
}
