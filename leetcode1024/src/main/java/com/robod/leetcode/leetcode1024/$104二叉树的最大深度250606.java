package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

public class $104二叉树的最大深度250606 {

    private int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        if (root != null) {
            recursion(root.left, 2);
            maxDepth = Math.max(1, maxDepth);
            recursion(root.right, 2);
        }
        return maxDepth;
    }

    private void recursion(TreeNode node, int deepth) {
        if (node == null) {
            return;
        }

        recursion(node.left, deepth + 1);
        maxDepth = Math.max(deepth, maxDepth);
        recursion(node.right, deepth + 1);
    }

}
