package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/binary-tree-right-side-view
 */
public class $199二叉树的右视图250616 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        List<TreeNode> tmp = new ArrayList<>();
        if (root != null) {
            tmp.add(root);
        }

        while (!tmp.isEmpty()) {
            result.add(tmp.get(tmp.size() - 1).val);

            List<TreeNode> newTmp = new ArrayList<>();
            for (TreeNode node : tmp) {
                if (node.left != null) {
                    newTmp.add(node.left);
                }
                if (node.right != null) {
                    newTmp.add(node.right);
                }
            }
            tmp = newTmp;
        }

        return result;
    }

}
