package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/flatten-binary-tree-to-linked-list
 */
public class $114二叉树展开为链表250616 {

    public void flatten(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();
        recursion(root, result);
        // System.out.println(result.size());

        TreeNode node = root;
        for (int i = 1; i < result.size(); i++) {
            node.left = null;
            node.right = result.get(i);
            node = node.right;
        }
    }

    private void recursion(TreeNode node, List<TreeNode> result) {
        if (node == null) {
            return;
        }

        result.add(node);
        recursion(node.left, result);
        recursion(node.right, result);
    }

}
