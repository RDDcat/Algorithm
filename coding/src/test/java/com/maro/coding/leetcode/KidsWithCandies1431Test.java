package com.maro.coding.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KidsWithCandies1431Test {
    private KidsWithCandies1431 kidsWithCandies = new KidsWithCandies1431();

    @Test
    @DisplayName("제공된 예시1")
    void example_1() {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        Boolean[] expectArray = {true,true,true,false,true};
        List<Boolean> expect = new ArrayList<>(List.of(expectArray));

        List<Boolean> output = kidsWithCandies.kidsWithCandies(candies, extraCandies);

        assertEquals(expect, output);
    }

    @Test
    @DisplayName("제공된 예시2")
    void example_2() {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        Boolean[] expectArray = {true,false,false,false,false};
        List<Boolean> expect = new ArrayList<>(List.of(expectArray));

        List<Boolean> output = kidsWithCandies.kidsWithCandies(candies, extraCandies);

        assertEquals(expect, output);
    }

    @Test
    @DisplayName("제공된 예시3")
    void example_3() {
        int[] candies = {12,1,12};
        int extraCandies = 1;
        Boolean[] expectArray = {true,false,true};
        List<Boolean> expect = new ArrayList<>(List.of(expectArray));

        List<Boolean> output = kidsWithCandies.kidsWithCandies(candies, extraCandies);

        assertEquals(expect, output);
    }
}
