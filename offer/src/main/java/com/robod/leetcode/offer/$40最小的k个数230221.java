package com.robod.leetcode.offer;

import java.util.Arrays;

/**
 * @ClassName $40最小的k个数230221
 * @Description 简单。https://leetcode.cn/problems/zui-xiao-de-kge-shu-lcof/
 * @Author Robod
 * @Date 2023/2/21 14:21
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $40最小的k个数230221 {
    public int[] getLeastNumbers(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1);
        return Arrays.copyOf(arr, k);
    }

    private void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int p = start;
        int q = end;
        while (p < q) {
            while (p < q && arr[q] >= arr[start]) q--;
            while (p < q && arr[p] <= arr[start]) p++;
            swap(arr, p, q);
        }
        swap(arr, p, start);

        quickSort(arr, start, p - 1);
        quickSort(arr, p + 1, end);
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1};
        new $40最小的k个数230221().getLeastNumbers(arr, 2);
    }
}
