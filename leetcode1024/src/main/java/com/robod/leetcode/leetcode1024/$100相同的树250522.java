package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * https://leetcode.cn/problems/same-tree/
 */
public class $100相同的树250522 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p, q);
    }

    private boolean isSame(TreeNode p, TreeNode q) {
        // System.out.println(p + "    " + q);
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            if (p.val == q.val) {
                return isSame(p.left, q.left) && isSame(p.right, q.right);
            } else {
                return false;
            }
        }
        if (p == null && q != null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }

        return isSame(p.left, q.left) && isSame(p.right, q.right);
    }

}
