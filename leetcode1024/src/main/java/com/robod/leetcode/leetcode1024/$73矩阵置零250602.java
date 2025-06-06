package com.robod.leetcode.leetcode1024;

import java.util.Arrays;

/**
 * @ClassName $73矩阵置零241127
 * @Description 中等。https://leetcode.cn/problems/set-matrix-zeroes/description/
 * @Author Robod
 */
public class $73矩阵置零250602 {

    public void setZeroes(int[][] matrix) {
        boolean row0Flag = false;
        boolean column0Flag = false;

        // 遍历第一行，看看有没有0
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                row0Flag = true;
                break;
            }
        }

        // 遍历第一列，看看有没有0
        for (int[] ints : matrix) {
            if (ints[0] == 0) {
                column0Flag = true;
                break;
            }
        }

        // 标记。如果某个格子有0，则将这一行，这一列的第一个设为0
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // 如果第一行或第一列是0，将这个格子设为0
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 如果第一行原先就有0，全设为0
        if (row0Flag) {
            Arrays.fill(matrix[0], 0);
        }

        // 如果第一列原先就有0，全设为0
        if (column0Flag) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }

}
