package com.robod.leetcode.offer;

/**
 * @ClassName $12矩阵中的路径230109
 * @Description :https://leetcode.cn/problems/ju-zhen-zhong-de-lu-jing-lcof/
 * @Author Robod
 * @Date 2023/1/9 00:41
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $12矩阵中的路径230109 {

    int m;  // 行
    int n;  // 列
    int len;    // 单词长度
    boolean[][] visited;    // 记录是否访问过

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        len = word.length();
        visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int index) {
        if (i < 0 ||
                i >= m ||
                j < 0 ||
                j >= n ||
                visited[i][j] ||
                board[i][j] != word.charAt(index)
        ) {
            return false;
        }

        if (index == len - 1) {
            return true;
        }

        visited[i][j] = true;

        boolean res = dfs(board, i + 1, j, word, index + 1) ||
                dfs(board, i, j + 1, word, index + 1) ||
                dfs(board, i - 1, j, word, index + 1) ||
                dfs(board, i, j - 1, word, index + 1);

        visited[i][j] = false;

        return res;
    }


}
