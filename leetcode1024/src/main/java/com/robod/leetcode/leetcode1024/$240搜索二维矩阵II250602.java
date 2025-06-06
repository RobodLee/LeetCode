package com.robod.leetcode.leetcode1024;

/**
 * https://leetcode.cn/problems/search-a-2d-matrix-ii
 */
public class $240搜索二维矩阵II250602 {

    /**
     * 从 右上角看，就是个二叉搜索树
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target) {
                return true;
            } else if (target < matrix[row][column]) {
                column--;
            } else if (target > matrix[row][column]) {
                row++;
            }
        }
        return false;
    }

}
