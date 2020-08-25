package com.robod.leetcode.arrays;

/**
 * @author Robod
 * @date 2020/8/25 10:54
 * 搜索二维矩阵
 */
public class $74_searchMatrix {

    //2020-8-25
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;        //行数
        if (row == 0) return false;
        int column = matrix[0].length;  //列数
        int left = 0,middle,num;
        int right = row*column-1;
        while(left <= right) {
            middle = left+(right-left)/2;
            num = matrix[middle/column][middle%column];
            if(target == num) return true;
            if(target < num) right = middle-1;
            if(target > num) left = middle + 1;
        }
        return false;
    }

}
