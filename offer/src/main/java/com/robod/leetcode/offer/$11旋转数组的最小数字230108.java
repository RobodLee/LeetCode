package com.robod.leetcode.offer;

/**
 * @ClassName $11旋转数组的最小数字230108
 * @Description TODO
 * @Author Robod
 * @Date 2023/1/8 23:30
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $11旋转数组的最小数字230108 {

    public int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        int middle;

        while (left < right) {
            // 本身已经有序
            if (numbers[left] < numbers[right]) {
                return numbers[left];
            }

            middle = (left + right) / 2;
            if (numbers[middle] > numbers[left]) {  // 说明 [left,middle] 是升序     45612
                left = middle + 1;
            } else if (numbers[middle] < numbers[left]) {   // 说明 [middle,right] 是升序 45123
                right = middle;
            } else if (numbers[middle] == numbers[left]) {  // 不确定middle位于左右哪个排序数组
                left = left + 1;
            }
        }
        return numbers[left];
    }

    public static void main(String[] args) {
        System.out.println(new $11旋转数组的最小数字230108().minArray(new int[]{3, 1, 3}));
    }

}
