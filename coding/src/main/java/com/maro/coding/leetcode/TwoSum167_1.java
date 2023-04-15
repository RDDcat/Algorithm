package com.maro.coding.leetcode;

public class TwoSum167_1 implements TwoSum167{
    // https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/?envType=study-plan&id=algorithm-i
    public int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];
        for (int i=0; i < numbers.length; i++) {
            for(int j=i+1; j < numbers.length; j++ ){
                if(numbers[i] + numbers[j] == target ){
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                }
            }
        }

        return null;
    }
}
