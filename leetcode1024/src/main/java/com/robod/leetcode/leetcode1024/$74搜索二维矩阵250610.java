package com.robod.leetcode.leetcode1024;

/**
 * https://leetcode.cn/problems/search-a-2d-matrix
 */
public class $74搜索二维矩阵250610 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rowIndex = 0;
        int columnIndex = matrix[0].length - 1;

        while (rowIndex < matrix.length && columnIndex >= 0) {
            if (target == matrix[rowIndex][columnIndex]) {
                return true;
            }

            if (target < matrix[rowIndex][columnIndex]) {
                columnIndex--;
            } else {
                rowIndex++;
            }
        }

        return false;
    }

}
