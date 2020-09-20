package com.robod.offer;

/**
 * @author Robod
 * @date 2020/9/20 15:40
 * 剑指 Offer 11. 旋转数组的最小数字
 */
public class $11_minArray {

    //2020-9-20
    public int minArray(int[] numbers) {
        if(numbers.length == 1) return numbers[0];

        int left = 0;
        int right = numbers.length-1;
        int middle = 0;
        while(numbers[left] >= numbers[right]) {
            if(right-left == 1) {
                middle = right;
                break;
            }
            middle = left + (right-left)/2;

            if(numbers[left] == numbers[middle] && numbers[right] == numbers[middle]) {
                int index = 0;
                int min = numbers[index];
                while(++index < numbers.length) {
                    min = Math.min(min,numbers[index]);
                }
                return min;
            }

            if(numbers[middle] >= numbers[left]) {
                left = middle;
            } else if(numbers[middle] <= numbers[right]) {
                right = middle;
            }
        }
        return numbers[middle];
    }

}
