package com.robod.leetcode;

/**
 * @author Robod
 * @date 2022/3/12 14:45
 * @description 链接：https://leetcode-cn.com/problems/spiral-matrix-ii/
 * <p>
 * 中等。模拟过程
 */
public class $59螺旋矩阵II220312 {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];   //存放结果的数组
        int start = 0;     //每次循环的起始位置 result[start][start]
        int count = 1;    //填充的数字
        int mid = n / 2;    //定义中间位置
        int loop = n / 2;   //循环次数
        int offset = 1;     //偏移量

        //循环填充数字
        while (loop > 0) {
            int i = start;
            int j = start;

            //上侧从左到右填充数字
            for (; j < start + n - offset; j++) {
                result[i][j] = count++;
            }

            //从上到下
            for (; i < start + n - offset; i++) {
                result[i][j] = count++;
            }

            //下侧从右到左
            for (; j > start; j--) {
                result[i][j] = count++;
            }

            //左侧从下到上
            for (; i > start; i--) {
                result[i][j] = count++;
            }

            loop--;
            offset += 2;
            start++;
        }
        //如果n为奇数，则填充中间位置
        if (n % 2 == 1) {
            result[mid][mid] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        new $59螺旋矩阵II220312().generateMatrix(5);
    }
}
