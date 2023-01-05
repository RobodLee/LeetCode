package com.robod.leetcode.offer;

/**
 * @ClassName $04二维数组中的查找230105
 * @Description 中等。二叉搜索树
 * @Author Robod
 * @Date 2023/1/5 09:27
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $04二维数组中的查找230105 {

    /**
     * 该二维数组从右上角可以看做是一颗二叉搜索树
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rowIndex = 0;
        int columnIndex = matrix[0].length - 1;

        while (rowIndex < matrix.length && columnIndex >= 0) {
            if (matrix[rowIndex][columnIndex] == target) {
                return true;
            }

            if (target < matrix[rowIndex][columnIndex]) {
                columnIndex--;
            } else if (target > matrix[rowIndex][columnIndex]) {
                rowIndex++;
            }
        }
        return false;
    }

}
