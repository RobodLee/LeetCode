package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $48旋转图像241130
 * @Description 中等。https://leetcode.cn/problems/rotate-image/
 * @Author Robod
 * @Date 2024/11/30 22:31
 */
public class $48旋转图像241130 {

    public void rotate(int[][] matrix) {
        // 拷贝原数组，辅助数组
        int[][] tempArr = new int[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, tempArr[i], 0, matrix[0].length);
        }

        // 将辅助数据对应位置的值赋值到原数组中
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = tempArr[matrix.length - 1 - j][i];
            }

        }

    }
}
