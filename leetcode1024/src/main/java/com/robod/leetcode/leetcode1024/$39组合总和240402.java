package com.robod.leetcode.leetcode1024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Description 递归
 * @Degree 中等
 * @Link :https://leetcode.cn/problems/combination-sum
 * @Author Robod
 * @Date 2024/4/2 15:23
 */
public class $39组合总和240402 {

    List<List<Integer>> result = new ArrayList<>();
    LinkedList<Integer> path = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        trace(candidates, target, 0, 0);

        return result;
    }

    private void trace(int[] candidates, int target, int nowSum, int startIndex) {
        if (nowSum >= target || startIndex >= candidates.length) {
            if (nowSum == target) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            int num = candidates[i];
            path.add(num);
            trace(candidates, target, nowSum + num, i);
            path.removeLast();
        }
    }

}
