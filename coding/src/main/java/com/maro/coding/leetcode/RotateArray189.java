package com.maro.coding.leetcode;

import java.util.Arrays;

public class RotateArray189 {
    public int[] rotate(int[] nums, int k) {
        int[] result = nums.clone();
        int index =0;
        for (int n:result) {
            while(index+k >= nums.length){
                index -= nums.length;
            }
            nums[index+k] = n;
            index++;
        }

        return nums;
    }
}
