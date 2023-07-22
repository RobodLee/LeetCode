package com.robod.leetcode.leetcode1024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName $406根据身高重建队列230219
 * @Description 中等，贪心。https://leetcode.cn/problems/queue-reconstruction-by-height/
 * @Author Robod
 * @Date 2023/2/19 16:19
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $406根据身高重建队列230219 {

    /**
     * people[h,k]
     */
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> {
            // 按h降序，k升序排列
            if (o1[0] != o2[0]) {
                return o2[0] - o1[0];// 后-前降序
            } else {
                return o1[1] - o2[1];// 前-后升序
            }
        });

        // 插队
        List<int[]> resultList = new LinkedList<>();
        for (int[] person : people) {
            int index = person[1];
            resultList.add(index, person);
        }

        return resultList.toArray(people);
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
        int[][] result = new $406根据身高重建队列230219().reconstructQueue(arr);

        List<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(1);
        a.add(2);
        a.add(10);
        a.add(7);
        a.sort((o1, o2) -> {
            return o2 - o1;
        });
        System.out.println();
    }

}
