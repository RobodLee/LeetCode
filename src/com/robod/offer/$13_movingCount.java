package com.robod.offer;

/**
 * @author Robod
 * @date 2020/9/24 7:28
 * 剑指 Offer 13. 机器人的运动范围
 */
public class $13_movingCount {

    //2020-9-24
    public int movingCount(int m, int n, int k) {
        if (m <= 0 || n <= 0) return 0;
        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);
    }

    //横坐标，纵坐标，
    public int dfs(int x, int y, int m, int n, int k, boolean[][] visted) {
        int count = 0;  //到达格子的次数

        if (!(x < 0 ||
                x >= m ||
                y < 0 ||
                y >= n ||
                visted[x][y] ||
                getDigitSum(x) + getDigitSum(y) > k)) {
            visted[x][y] = true;
            return 1 + dfs(x + 1, y, m, n, k, visted) +
                    dfs(x, y + 1, m, n, k, visted) +
                    dfs(x - 1, y, m, n, k, visted) +
                    dfs(x, y - 1, m, n, k, visted);
        }
        return count;
    }

    //得到一个数字的数位之和
    public int getDigitSum(int num) {
        int result = 0;
        while (num / 10 != 0) {
            result += num % 10;
            num /= 10;
        }
        return result + num;
    }

}
