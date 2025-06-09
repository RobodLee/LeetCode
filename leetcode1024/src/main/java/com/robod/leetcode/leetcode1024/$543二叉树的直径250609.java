package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * https://leetcode.cn/problems/diameter-of-binary-tree
 */
public class $543二叉树的直径250609 {

    private int maxLen = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxLen;
    }

    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int l = dfs(node.left);
        int r = dfs(node.right);
        maxLen = Math.max(maxLen, l + r);
        return Math.max(l, r) + 1;
    }

}
