package com.robod.leetcode.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author Robod
 * @date 2020/9/15 7:39
 * 比较含退格的字符串
 */
public class $844_backspaceCompare {

    public boolean backspaceCompare(String S, String T) {
        char[] sArray = S.toCharArray();
        char[] tArray = T.toCharArray();
        Stack sStack = new Stack();
        Stack tStack = new Stack();
        for(int i=0;i<sArray.length;i++) {
            if(sArray[i] != '#') {
                sStack.push(sArray[i]);
            } else if(!sStack.empty()) {
                sStack.pop();
            }
        }
        for(int i=0;i<tArray.length;i++) {
            if(tArray[i] != '#') {
                tStack.push(tArray[i]);
            } else if(!tStack.empty()) {
                tStack.pop();
            }
        }
        if(Arrays.equals(sStack.toArray(),tStack.toArray())) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new $844_backspaceCompare().backspaceCompare("ab##", "c#d#"));
    }

}
