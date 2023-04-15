package com.maro.coding.leetcode;

public class TwoSum167_2 implements TwoSum167{
    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan&id=algorithm-i
    public int[] twoSum(int[] numbers, int target) {
        int min = 0;
        int max = numbers.length - 1;

        for(int i=0; i<numbers.length;i++){
            if (numbers[min] + numbers[max] == target) {
                return new int[]{min + 1, max +1};
            } else if (numbers[min] + numbers[max] > target) {
                max--;
            } else {
                min++;
            }
        }
        return null;

    }
}
