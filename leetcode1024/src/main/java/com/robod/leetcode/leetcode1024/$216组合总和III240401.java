package com.robod.leetcode.leetcode1024;

import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description 递归
 * @Degree 中等
 * @Link :https://leetcode.cn/problems/combination-sum-iii
 * @Author Robod
 * @Date 2024/4/1 21:32
 */
public class $216组合总和III240401 {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        trace(k, n, 0, 1);

        return result;
    }

    private void trace(int k, int n, int nowSum, int startIndex) {
        if (nowSum >= n || path.size() >= k) {
            if (nowSum == n && path.size() == k) {
                result.add(new ArrayList(path));
            }
            return;
        }

        // 优化，剪枝，剩下的数不够，就不用继续循环了
        for (int i = startIndex; i <= 9 - (k - path.size()) + 1; i++) {
//        for (int i = startIndex; i <= 9; i++) {
            path.add(i);
            trace(k, n, nowSum + i, i + 1);
            path.removeLast();
        }
    }

    public static void main(String[] args) {
        $216组合总和III240401 a = new $216组合总和III240401();
        List<List<Integer>> lists = a.combinationSum3(3, 7);
        System.out.println(JSONUtil.toJsonStr(lists));

    }

}
