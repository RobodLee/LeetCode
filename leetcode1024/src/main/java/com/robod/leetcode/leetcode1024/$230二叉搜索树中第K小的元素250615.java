package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * https://leetcode.cn/problems/kth-smallest-element-in-a-bst
 */
public class $230二叉搜索树中第K小的元素250615 {

    private int k;
    private int val;

    /**
     * 中序遍历
     */
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        recursion(root);
        return val;
    }

    private void recursion(TreeNode node) {
        if (node == null || k == 0) {
            return;
        }

        recursion(node.left);

        if (k > 0) {
            val = node.val;
            k--;
        }

        recursion(node.right);
    }


}
