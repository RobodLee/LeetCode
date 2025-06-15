package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * https://leetcode.cn/problems/validate-binary-search-tree
 */
public class $98验证二叉搜索树250615 {

    public boolean isValidBST(TreeNode root) {
        return recursion(root, (long) Integer.MIN_VALUE - 1, (long) Integer.MAX_VALUE + 1);
    }

    private boolean recursion(TreeNode node, long low, long up) {
        if (node == null) {
            return true;
        }

        if (node.val <= low || node.val >= up) {
            return false;
        }

        return recursion(node.left, low, node.val) && recursion(node.right, node.val, up);
    }

}
