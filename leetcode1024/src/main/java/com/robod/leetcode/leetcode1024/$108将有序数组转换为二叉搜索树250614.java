package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * https://leetcode.cn/problems/convert-sorted-array-to-binary-search-tree
 */
public class $108将有序数组转换为二叉搜索树250614 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int middle = (left + right) / 2;
        TreeNode leftNode = build(nums, left, middle - 1);
        TreeNode rightNode = build(nums, middle + 1, right);

        return new TreeNode(nums[middle], leftNode, rightNode);
    }

}
