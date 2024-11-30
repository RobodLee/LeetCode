package com.robod.leetcode.leetcode1024;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName $46全排列2411130
 * @Description 中等。回溯。https://leetcode.cn/problems/permutations/description/
 * @Author Robod
 * @Date 2024/11/30 23:33
 */
public class $46全排列2411130 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dig(result, new ArrayList<>(), nums);
        return result;
    }

    /**
     * 递归计算
     *
     * @param result 总的结果集
     * @param list   单次递归的结果
     * @param nums   入参数组
     */
    private void dig(List<List<Integer>> result, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            result.add(new ArrayList<>(list));
            return;
        }

        for (int num : nums) {
            if (!list.contains(num)) {
                list.add(num);
                dig(result, list, nums);
                list.remove(list.size() - 1);
            }

        }
    }
}
