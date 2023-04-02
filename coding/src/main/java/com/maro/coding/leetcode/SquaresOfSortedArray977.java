package com.maro.coding.leetcode;

import java.util.Arrays;

public class SquaresOfSortedArray977 {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int index = 0;
        // 투포인터
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length-1;

        for (int n:nums) {
            squares[index++] = (int) Math.pow(n,2);
        }
//        System.out.println(Arrays.toString(squares));


        while(index > 0){
            if(squares[start] > squares[end]){
                result[--index] = squares[start];
                start++;
            }
            else {
                result[--index] = squares[end];
                end--;
            }
        }
//        System.out.println(Arrays.toString(result));

        return result;
    }
}
