package com.robod.leetcode.leetcode1024;

import cn.hutool.json.JSONUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName $15三数之和241203
 * @Description 中等。https://leetcode.cn/problems/3sum/description/
 * @Author Robod
 * @Date 2024/12/3 22:20
 */
public class $15三数之和241204 {

    // 思路对，但是超时了
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> result = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        recursion(result, list, nums, 0, new HashSet<>());
//        return result;
//    }
//
//    private void recursion(List<List<Integer>> result,
//                           List<Integer> list,
//                           int[] nums,
//                           int index,
//                           Set<List<Integer>> distinctSet) {
//        if (list.size() > 3) {
//            return;
//        }
//        if (list.size() == 3 && list.get(0) + list.get(1) + list.get(2) == 0) {
//            List<Integer> sortedCopy = new ArrayList<>(list).stream().sorted().collect(Collectors.toList());
//            if (!distinctSet.contains(sortedCopy)) {
//                result.add(sortedCopy);
//                distinctSet.add(sortedCopy);
//            }
//        }
//
//        for (int i = index; i < nums.length; i++) {
//            list.add(nums[i]);
//            recursion(result, list, nums, i + 1, distinctSet);
//            list.remove(list.size() - 1);
//        }
//    }

    /**
     * 双指针法
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // 从小到大排序
        Arrays.sort(nums);

        int j, k;
        for (int i = 0; i < nums.length - 2; i++) {
            // 大于0，说明后面的相加不可能等于0
            if (nums[i] > 0) {
                break;
            }

            // 相邻的数相等。说明已经有答案了，跳过
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            j = i + 1;
            k = nums.length - 1;
            while (j < k) {
                int ijkSum = nums[i] + nums[j] + nums[k];
                if (ijkSum < 0) {
                    j++;
                } else if (ijkSum > 0) {
                    k--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // 相邻的数相等。说明已经有答案了，跳过
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    j++;
                    // 相邻的数相等。说明已经有答案了，跳过
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    k--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        List<List<Integer>> listList = new $15三数之和241203().threeSum(new int[]{-1, 0, 1, 2, -1, -4});
//        List<List<Integer>> listList = new $15三数之和241203().threeSum(new int[]{13, -5, 3, 3, -1, 13, 3, 1, -9, -4, 9, 12, 6, -9, -6, -12, -8, 3, 12, 14, 4, -15, 2, -11, 4, -12, 10, 9, -6, -3, -8, 14, 7, 3, 2, -8, -7, -10, 8, -8, -7, -6, -11, 6, -7, -2, 9, -8, 8, -2, 13, -10, -2, 0, -14, -13, -4, 11, 3, -3, -7, 3, -4, 8, 13, 13, -15, -9, 10, 0, -2, -12, 1, 2, 9, 1, 8, -4, 8, -7, 9, 7, -2, -15, 14, 0, -13, -13, -12, -2, -1, -11, 8, 10, 12, 6, 8, 4, 12, 3, 11, -12, -2, -3, 5, -15, 6, -10, -4, -1, -1, -10, 13});
        List<List<Integer>> listList = new $15三数之和241204().threeSum(new int[]{0, 0, 0});
        System.out.println(JSONUtil.toJsonStr(listList));
    }

}
