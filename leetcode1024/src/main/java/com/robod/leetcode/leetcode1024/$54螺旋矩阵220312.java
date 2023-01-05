package com.robod.leetcode.leetcode1024;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Robod
 * @date 2022/3/12 15:31
 * @description 链接：https://leetcode-cn.com/problems/spiral-matrix/
 */
public class $54螺旋矩阵220312 {

    //结合Readme.md文件中的附图进行理解
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowNum = matrix.length;    //matrix的行数
        int columnNum = matrix[0].length; //matrix的列数

        int start = 0;    //每一圈的起始位置 matrix[start][start]
        int sum = rowNum * columnNum;   //二维数组的大小
        int count = 0;    //扫描到的数字数量，如果count=sum则说明扫描结束
        int offset = 1;

        List<Integer> result = new ArrayList<>();

        while (count < sum) {
            int i = start;
            int j = start;

            //上侧从左向右，扫描一整行
            for (; j <= start + columnNum - offset && count < sum; j++) {
                result.add(count++, matrix[i][j]);
            }

            //右侧从上至下
            //如果是3*3矩阵，以第一圈扫描为例，上面一个循环结束之后，i==3，j==0，而下面循环应该从2,1开始，所以一开始i++，j--，使其指向2,1
            for (i++,j--; i < start + rowNum - offset && count < sum; i++) {
                result.add(count++, matrix[i][j]);
            }

            //下侧从右向左
            for (; j > start && count < sum; j--) {
                result.add(count++, matrix[i][j]);
            }

            //左侧从下向上
            for (; i > start && count < sum; i--) {
                result.add(count++, matrix[i][j]);
            }

            start++;
            offset += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        new $54螺旋矩阵220312().spiralOrder(matrix);
    }
}
