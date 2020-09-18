package com.robod.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Robod
 * @date 2020/9/1 21:42
 * 数组中重复的数字
 */
public class $3_findRepeatNumber {

    //2020-9-1
    public int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums) {
            int a = map.getOrDefault(num,-1);
            if(a != -1) return a;
            map.put(num,num);
        }
        return -1;
    }

}
