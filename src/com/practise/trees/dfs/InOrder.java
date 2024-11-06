package com.practise.trees.dfs;

import com.practise.trees.basic.TreeNode;

/*
Algorithm for InOrder Traversal:
 Traverse the left subtree, i.e., call Preorder(left->subtree)
 Visit the root.
 Traverse the right subtree, i.e., call Preorder(right->subtree)
 */
public class InOrder {
    static void inOrderTraversal(TreeNode root){
        if(root == null) return;
        // traverse the left sub tree
        if (root.left != null){
            inOrderTraversal(root.left);
        }
        // visit the root
        System.out.print(root.val + "->");
        // traverse the right sub tree
        if(root.right != null){
            inOrderTraversal(root.right);
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
        System.out.printf("Binary Tree:: %1$s %n DFS: In order traversal of the tree:: %n ", root.toString());
        inOrderTraversal(root);
    }
}
