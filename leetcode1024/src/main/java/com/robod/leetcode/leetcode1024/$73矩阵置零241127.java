package com.robod.leetcode.leetcode1024;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName $73矩阵置零241127
 * @Description 中等。https://leetcode.cn/problems/set-matrix-zeroes/description/
 * @Author Robod
 * @Date 2024/11/27 下午9:25
 */
public class $73矩阵置零241127 {

    public void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> columnSet = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rowSet.add(i);
                    columnSet.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowSet.contains(i) || columnSet.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

}
