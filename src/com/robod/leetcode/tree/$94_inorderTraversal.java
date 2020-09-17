package com.robod.leetcode.tree;

import com.robod.entity.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robod
 * @date 2020/9/17 8:41
 * 94. 二叉树的中序遍历
 */
public class $94_inorderTraversal {

    //2020-9-17
    private List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        method(root);
        return list;
    }

    public void method(TreeNode node) {
        if(node == null) return;
        method(node.left);
        list.add(node.val);
        method(node.right);
    }

}
