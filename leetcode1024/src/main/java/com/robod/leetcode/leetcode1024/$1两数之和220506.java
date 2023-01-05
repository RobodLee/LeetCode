package com.robod.leetcode.leetcode1024;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Robod
 * @date 2022/5/6 22:57
 * @description :https://leetcode-cn.com/problems/two-sum/
 * <p>
 * 简单。哈希。
 */
public class $1两数之和220506 {

    public int[] twoSum(int[] nums, int target) {
        //map的key存放数组中的值，value为对应的下标
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            //例如nums[i]为2，target为9，则temp为7
            int temp = target - nums[i];
            //如果map中包含对应的temp值，则将两个下标放入到res中返回
            if (map.containsKey(temp)) {
                res[0] = i;
                res[1] = map.get(temp);
                return res;
            }
            map.put(nums[i], i);    //将当前遍历到的数组值与下标放入到map中
        }
        return null;
    }
}
