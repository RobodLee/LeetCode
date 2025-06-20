package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree
 */
public class $236二叉树的最近公共祖先250620 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pParentList = new ArrayList<>();
        List<TreeNode> qParentList = new ArrayList<>();

        find(pParentList, root, p);
        find(qParentList, root, q);

        for (TreeNode pParent : pParentList) {
            System.out.println("pParent" + pParent);
            for (TreeNode qParent : qParentList) {
                System.out.println("qParent" + qParent);
                if (pParent.val == qParent.val) {
                    return pParent;
                }
            }
        }

        return null;
    }

    private boolean find(List<TreeNode> resultList, TreeNode node, TreeNode target) {
        if (node == null) {
            return false;
        }

        if (node.val == target.val) {
            resultList.add(node);
            return true;
        }

        boolean leftIsParent = find(resultList, node.left, target);
        boolean rightIsParent = find(resultList, node.right, target);

        if (leftIsParent || rightIsParent) {
            resultList.add(node);
        }

        return leftIsParent || rightIsParent;
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});

        System.out.println(new $236二叉树的最近公共祖先250620().lowestCommonAncestor(root, new TreeNode(5), new TreeNode(1)));
    }

}
