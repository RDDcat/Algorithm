package com.maro.coding.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSum167Test {
    private TwoSum167 twoSum167 = new TwoSum167_2();

    @Test
    @DisplayName("제공된 예시1")
    void example_1() {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] output = twoSum167.twoSum(nums, target);

        assertArrayEquals(new int[]{1,2}, output);
    }

    @Test
    @DisplayName("제공된 예시2")
    void example_2() {
        int[] nums = {2,3,4};
        int target = 6;

        int[] output = twoSum167.twoSum(nums, target);

        assertArrayEquals(new int[]{1,3}, output);
    }

    @Test
    @DisplayName("제공된 예시3")
    void example_3() {
        int[] nums = {-1,0};
        int target = -1;

        int[] output = twoSum167.twoSum(nums, target);

        assertArrayEquals(new int[]{1,2}, output);
    }


}
