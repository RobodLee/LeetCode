package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $48旋转图像241130
 * @Description 中等。https://leetcode.cn/problems/rotate-image/
 * @Author Robod
 */
public class $48旋转图像250602 {

    public void rotate(int[][] matrix) {
        int offset = 0;
        int len = matrix.length;
        while (offset < len / 2) {
            // System.out.println("offset__" + offset);
            for (int i = 0; i < len - 2 * offset - 1; i++) {
                // System.out.println("iiiiiii__" + i);
                // 上->右
                int rightVal = matrix[offset + i][len - offset - 1];
                // System.out.println("rightVal:" + rightVal);
                matrix[offset + i][len - offset - 1] = matrix[offset][offset + i];

                // 右->下
                int bottomVal = matrix[len - offset - 1][len - offset - i - 1];
                // System.out.println("bottomVal:" + bottomVal);
                matrix[len - offset - 1][len - offset - i - 1] = rightVal;

                // 下->左
                int leftVal = matrix[len - offset - i - 1][offset];
                // System.out.println("leftVal:" + leftVal);
                matrix[len - offset - i - 1][offset] = bottomVal;

                // 左->上
                matrix[offset][offset + i] = leftVal;
            }
            offset++;
        }
    }

}
