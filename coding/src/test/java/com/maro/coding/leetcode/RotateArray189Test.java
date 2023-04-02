package com.maro.coding.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("189. Rotate Array 테스트")
public class RotateArray189Test {
    RotateArray189 rotateArray = new RotateArray189();

    @Test
    @DisplayName("제공된 예시1")
    void example_1() {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;

        int[] output = rotateArray.rotate(nums, k);

        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, output);
    }

    @Test
    @DisplayName("제공된 예시2")
    void example_2() {
        int[] nums = {-1,-100,3,99};
        int k = 2;

        int[] output = rotateArray.rotate(nums, k);

        assertArrayEquals(new int[]{3,99,-1,-100}, output);
    }
}
