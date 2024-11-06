package com.practise.trees.bfs;

import com.practise.trees.basic.TreeNode;
import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/*
Level Order Traversal(Breadth First Search or BFS) technique is defined as a method to traverse a Tree
such that all nodes present in the same level are traversed completely before traversing the next level.
 */
public class BFS {
    static void printLevelOrder(TreeNode root){
        System.out.println("Tree level order ::" + root + "\n");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            if (current.left != null){
                queue.add(current.left);
            }
            if (current.right != null){
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode grandLeftChild = new TreeNode(4);
        TreeNode grandRightChild = new TreeNode(5);
        TreeNode leftChild = new TreeNode(2, grandLeftChild, grandRightChild);
        TreeNode rightChild = new TreeNode(3);
        TreeNode root = new TreeNode(1, leftChild, rightChild);
        printLevelOrder(root);
    }
}
