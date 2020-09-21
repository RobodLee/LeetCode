package com.robod.offer;

/**
 * @author Robod
 * @date 2020/9/21 13:50
 * 剑指 Offer 12. 矩阵中的路径
 */
public class $12_exist {

    //2020-9-21
    public boolean exist(char[][] board, String word) {
        for(int i = 0;i<board.length;i++) {
            for(int j = 0;j<board[0].length;j++) {
                if(dfs(word,board,i,j,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    //字符串，矩阵，当前行，当前列，当前字符串的位置
    public boolean dfs(String word,char[][] board,int row,int col,int index) {
        if(row<0 ||
                row>board.length-1 ||
                col<0 ||
                col>board[0].length-1 ||
                board[row][col]=='~' ||
                index >= word.length() ||
                word.charAt(index)!=board[row][col]) {
            return false;
        }
        if(index == word.length()-1) {
            return true;
        }
        char temp = board[row][col];
        board[row][col]='~';
        boolean result = dfs(word,board,row-1,col,index+1) ||     //上
                dfs(word,board,row+1,col,index+1) ||         //下
                dfs(word,board,row,col-1,index+1) ||       //左
                dfs(word,board,row,col+1,index+1);       //右
        board[row][col] = temp;
        return result;
    }

}
