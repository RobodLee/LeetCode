package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $27移除元素220301
 * @Description 简单。https://leetcode.cn/problems/remove-element/
 * @Author Robod
 * @Date 2022/3/1 9:57
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $27移除元素220301 {

    /**
     * 双指针法，遍历时，判断快指针指向元素是否与目标元素不相等。相等则不进入if，不相等则将快指针元素赋值给慢指针元素。也就是说，慢指针指向的是最终的数组，快指针依次将原数组中符合条件的元素赋值给慢指针。
     * 如果不理解，可以先创建一个新的数组，慢指针指向新数组，就可以看做是将原数组中的符合条件的值依次赋值给新数组。
     */
    private int removeElement(int[] nums, int val) {
        int slowPointer = 0;
        for (int fastPointer = 0; fastPointer < nums.length; fastPointer++) {
            if (nums[fastPointer] != val) {
                nums[slowPointer++] = nums[fastPointer];
            }
        }
        return slowPointer;
    }

}
