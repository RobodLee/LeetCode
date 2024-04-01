package com.robod.leetcode.leetcode1024;

import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description 递归
 * @Degree 中等
 * @Link :https://leetcode.cn/problems/combinations/
 * @Author Robod
 * @Date 2024/4/1 20:46
 */
public class $77组合240401 {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        recursion(n, k, 1);

        return result;
    }

    private void recursion(int n, int k, int startIndex) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        // i <= n - (k - path.size()) + 1 剪枝，如果剩下的元素不够了，就不用循环下去了
        for (int i = startIndex; i <= n - (k - path.size()) + 1; i++) {
//        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            recursion(n, k, i + 1);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        $77组合240401 aaa = new $77组合240401();
        List<List<Integer>> combine = aaa.combine(5, 5);
        for (List<Integer> integers : combine) {
            System.out.println(JSONUtil.toJsonStr(integers));
        }
//        System.out.println(JSONUtil.toJsonStr(combine));
    }

}
