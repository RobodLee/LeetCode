package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $64最小路径和240924
 * @Description https://leetcode.cn/problems/minimum-path-sum/description/
 * @Author Robod
 * @Date 2024/9/24 下午9:51
 */
public class $64最小路径和240924 {

    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i > 0 && j > 0) {
                    // 左右都不在边界
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                } else if (i == 0 && j > 0) {
                    // 在第一列
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                } else if (i > 0 && j == 0) {
                    // 在第一行
                    grid[i][j] = grid[i - 1][j] + grid[i][j];
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }

}
