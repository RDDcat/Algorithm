package com.maro.coding.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies1431 {
    // https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        // 최고 캔디 값 구하기
        int greatest = 0;
        for(int candy: candies){
            if(greatest< candy){
                greatest = candy;
            }
        }

        // 캔디 순회
        for(int i=0; i < candies.length; i++){
            if(candies[i] + extraCandies >= greatest){
                result.add(true);
                continue;
            }
            result.add(false);
        }

        return result;
    }
}
