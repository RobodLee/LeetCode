package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.cn/problems/binary-tree-level-order-traversal
 */
public class $102二叉树的层序遍历250612 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        List<TreeNode> tmp = new LinkedList<>();
        if (root != null) {
            tmp.add(root);
        }
        while (!tmp.isEmpty()) {
            result.add(getList(tmp));

            List<TreeNode> tmp2 = new LinkedList<>();
            for (TreeNode treeNode : tmp) {
                if (treeNode.left != null) {
                    tmp2.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    tmp2.add(treeNode.right);
                }
            }
            tmp = tmp2;
        }
        return result;
    }

    private List<Integer> getList(List<TreeNode> nodeList) {
        List<Integer> list = new ArrayList<>();
        for (TreeNode treeNode : nodeList) {
            list.add(treeNode.val);
        }
        return list;
    }

}
