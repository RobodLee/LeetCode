package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class $94二叉树的中序遍历250606 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            recursion(result, root.left);
            result.add(root.val);
            recursion(result, root.right);
        }
        return result;
    }

    private void recursion(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }

        recursion(result, node.left);
        result.add(node.val);
        recursion(result, node.right);
    }

}
