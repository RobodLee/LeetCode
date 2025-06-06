package com.robod.leetcode.leetcode1024;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName $54螺旋矩阵220312
 * @Description 中等。https://leetcode-cn.com/problems/spiral-matrix/
 * @Author Robod
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $54螺旋矩阵250602 {

    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int left = 0;

        List<Integer> result = new ArrayList<>();
        while (left <= right && top <= bottom) {
            // 从左向右
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }

            // 从上至下
            for (int i = top + 1; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            if (top < bottom) {
                // 从右至左
                for (int i = right - 1; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }

            if (left < right) {
                // 从下至上
                for (int i = bottom - 1; i > top; i--) {
                    result.add(matrix[i][left]);
                }
            }

            top++;
            right--;
            bottom--;
            left++;
        }

        return result;
    }

}
