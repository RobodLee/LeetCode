package com.robod.leetcode.leetcode1024;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://leetcode.cn/problems/subsets
 */
public class $78子集250609 {

    public List<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();
        List<Integer> tempList = new ArrayList<>();
        recursion(0, resultSet, tempList, nums);
        return new ArrayList<>(resultSet);
    }

    private void recursion(int i, Set<List<Integer>> resultSet, List<Integer> tempList, int[] nums) {
        resultSet.add((tempList.stream().sorted().collect(Collectors.toList())));

        for (int j = i; j < nums.length; j++) {
            if (!tempList.contains(nums[j])) {
                tempList.add(nums[j]);
                recursion(j, resultSet, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}
