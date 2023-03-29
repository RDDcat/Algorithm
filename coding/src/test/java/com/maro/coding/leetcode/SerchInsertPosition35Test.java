package com.maro.coding.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SerchInsertPosition35Test {
    SerchInsertPosition35 serchInsertPosition = new SerchInsertPosition35();

    @Test
    @DisplayName("제공된 예시1")
    void example_1() {
        int[] nums = {1,3,5,6};
        int target = 5;

        int output = serchInsertPosition.searchInsert(nums, target);

        assertEquals(2, output);
    }

    @Test
    @DisplayName("제공된 예시2")
    void example_2() {
        int[] nums = {1,3,5,6};
        int target = 2;

        int output = serchInsertPosition.searchInsert(nums, target);

        assertEquals(1, output);
    }

    @Test
    @DisplayName("제공된 예시3")
    void example_3() {
        int[] nums = {1,3,5,6};
        int target = 7;

        int output = serchInsertPosition.searchInsert(nums, target);

        assertEquals(4, output);
    }
}
