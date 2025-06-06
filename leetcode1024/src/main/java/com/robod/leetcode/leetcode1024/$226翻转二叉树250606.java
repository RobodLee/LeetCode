package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

public class $226翻转二叉树250606 {

    public TreeNode invertTree(TreeNode root) {
        recursion(root);
        return root;
    }

    private void recursion(TreeNode node) {
        if (node == null) {
            return;
        }

        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;

        recursion(node.left);
        recursion(node.right);
    }

}
