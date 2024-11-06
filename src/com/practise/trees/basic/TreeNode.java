package com.practise.trees.basic;

public class TreeNode {
    @Override
    public String toString() {
        return "{ " + val +
                " , left = " + left +
                " , right = " + right +
                " }";
    }

    public int val;
    public TreeNode left, right;
    public TreeNode(int data){
        this.val = data;
        this.left = this.right = null;
    }
    public TreeNode(int data, TreeNode left, TreeNode right){
        this.val = data;
        this.left = left;
        this.right = right;
    }
}
