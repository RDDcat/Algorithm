package com.maro.coding.leetcode;

public class MoveZeroes283 {
    // https://leetcode.com/problems/move-zeroes/?envType=study-plan&id=algorithm-i
    public int[] moveZeroes(int[] nums) {
        int index=0;
        for (int num:nums) {
            if(num != 0){
                nums[index++] = num;
            }
        }
        for (int i = index; i < nums.length; i++){
            nums[i] = 0;
        }


        return nums;
    }
}
