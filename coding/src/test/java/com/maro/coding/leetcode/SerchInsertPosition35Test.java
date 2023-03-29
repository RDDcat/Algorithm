package com.maro.coding.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Serch Insert Position 35 테스트")
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

    @Test
    @DisplayName("예시1 : 더 큰 정렬된 배열, 배열안에 값이 있음")
    void example_4() {
        int[] nums = {1,3,5,6,7,9,11,12,14,15,16,18,21,22,25,29,30,31,33,34,35,37,38,40,42,43,45,47,48,50};
        int target = 22;

        int output = serchInsertPosition.searchInsert(nums, target);

        assertEquals(13, output);
    }

    @Test
    @DisplayName("예시2 : 더 큰 정렬된 배열, 배열안에 값이 없음")
    void example_5() {
        int[] nums = {1,3,5,6,7,9,11,12,14,15,16,18,21,22,25,29,30,31,33,34,35,37,38,40,42,43,45,47,48,50};
        int target = 23;

        int output = serchInsertPosition.searchInsert(nums, target);

        assertEquals(14, output);
    }

    @Test
    @DisplayName("예시3 : 더 큰 정렬된 배열, target을 마지막에 추가")
    void example_6() {
        int[] nums = {1,3,5,6,7,9,11,12,14,15,16,18,21,22,25,29,30,31,33,34,35,37,38,40,42,43,45,47,48,50};
        int target = 51;

        int output = serchInsertPosition.searchInsert(nums, target);

        assertEquals(30, output);
    }
}
