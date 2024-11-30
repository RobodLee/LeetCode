package com.robod.leetcode.leetcode1024;

import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName $46全排列2411130
 * @Description 中等。回溯。https://leetcode.cn/problems/permutations/description/
 * @Author Robod
 * @Date 2024/11/30 23:33
 */
public class $47全排列II2411130 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dig(result, new HashSet<>(), new ArrayList<>(), new HashSet<>(), nums);
        return result;
    }

    /**
     * 递归计算
     *
     * @param result       总的结果集
     * @param resultSet    总的结果集set
     * @param list         单次递归的结果
     * @param numsIndexSet 单次递归结果的下标set
     * @param nums         入参数组
     */
    private void dig(List<List<Integer>> result, Set<List<Integer>> resultSet,
                     List<Integer> list,
                     Set<Integer> numsIndexSet,
                     int[] nums) {
        if (list.size() == nums.length && !resultSet.contains(list)) {
            List<Integer> copy = new ArrayList<>(list);
            result.add(copy);
            resultSet.add(copy);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!numsIndexSet.contains(i)) {
                list.add(nums[i]);
                numsIndexSet.add(i);
                dig(result, resultSet, list, numsIndexSet, nums);
                list.remove(list.size() - 1);
                numsIndexSet.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(JSONUtil.toJsonStr(new $47全排列II2411130().permuteUnique(new int[]{1, 1, 2, 2, 2, 2})));
    }
}
