package com.robod.leetcode.leetcode1024;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class $36有效的数独250516 {

    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Map<Character, Integer>> rowMap = new HashMap<>();
        Map<Integer, Map<Character, Integer>> colomnMap = new HashMap<>();
        Map<String, Map<Character, Integer>> gridMap = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            Map<Character, Integer> rowMapSub = rowMap.computeIfAbsent(i, k -> new HashMap<>());
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (!Objects.equals(c, '.')) {
                    int rowCount = rowMapSub.computeIfAbsent(c, k -> 0) + 1;
                    if (rowCount > 1) {
                        return false;
                    }
                    rowMapSub.put(c, rowCount + 1);

                    Map<Character, Integer> columnMapSub = colomnMap.computeIfAbsent(j, k -> new HashMap<>());
                    int columnCount = columnMapSub.computeIfAbsent(c, k -> 0) + 1;
                    if (columnCount > 1) {
                        return false;
                    }
                    columnMapSub.put(c, columnCount);

                    Map<Character, Integer> gridMapSub = gridMap.computeIfAbsent(i / 3 + "" + j / 3, k -> new HashMap<>());
                    int gridCount = gridMapSub.computeIfAbsent(c, k -> 0) + 1;
                    if (gridCount > 1) {
                        return false;
                    }
                    gridMapSub.put(c, gridCount + 1);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 创建并初始化数独二维数组
        char[][] sudokuBoard = {
                {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };

        System.out.println(new $36有效的数独250516().isValidSudoku(sudokuBoard));
    }

}
