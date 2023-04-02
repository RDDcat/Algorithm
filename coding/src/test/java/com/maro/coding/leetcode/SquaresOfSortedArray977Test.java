package com.maro.coding.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("977. Squares of a Sorted Array 테스트")
public class SquaresOfSortedArray977Test {
    SquaresOfSortedArray977 sortedSquares = new SquaresOfSortedArray977();

    @Test
    @DisplayName("제공된 예시1")
    void example_1() {
        int[] nums = {-4,-1,0,3,10};
        int target = 5;

        int[] output = sortedSquares.sortedSquares(nums);

        assertArrayEquals(new int[]{0,1,9,16,100}, output);
    }

    @Test
    @DisplayName("제공된 예시2")
    void example_2() {
        int[] nums = {-7,-3,2,3,11};
        int target = 2;

        int[] output = sortedSquares.sortedSquares(nums);

        assertArrayEquals(new int[]{4,9,9,49,121}, output);
    }
}
