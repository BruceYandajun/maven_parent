package com.github.bruce.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序：稳定
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 */

public class BubbleSort {

    private static int[] nums = {6, 10, 2, 5, 7};

    public static void main(String[] args) {
        for (int i = 0; i < nums.length - 1; i ++) {
            for (int j = 0; j < nums.length - 1 - i; j ++) {
                if (nums[j] > nums[j + 1]) {
                    Sorts.swap(nums, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
