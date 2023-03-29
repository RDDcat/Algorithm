package com.maro.coding.leetcode;

public class SerchInsertPosition35 {
    // https://leetcode.com/problems/search-insert-position/?envType=study-plan&id=algorithm-i
    /* 타겟을 찾으면 그 타겟의 인덱스를 리턴
       타겟을 못찾으면 그 타겟이 삽입되어야하는 위치를 리턴 */
    public int searchInsert(int[] nums, int target) {
        int start =0;
        int end = nums.length -1;
        int mid =0;

        while (start <= end){
            mid = start + (end - start) / 2;
            if(target == nums[mid]){
                return mid;
            }
            if(target > nums[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        if(start < end){
            return start+1;
        }
        return start;
    }
}
