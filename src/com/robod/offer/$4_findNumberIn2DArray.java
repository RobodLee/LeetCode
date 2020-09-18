package com.robod.offer;

/**
 * @author Robod
 * @date 2020/9/17 19:44
 * 剑指 Offer 04. 二维数组中的查找
 */
public class $4_findNumberIn2DArray {

    //2020-9-17
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0) return false;
        int rows = matrix.length;        //行
        int cols = matrix[0].length;     //列
        int row = 0;    //横坐标
        int col = cols-1;   //纵坐标
        while(row<rows && col>=0) {
            int temp = matrix[row][col];
            if(target == temp) return true;
            if(target > temp) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }

}
