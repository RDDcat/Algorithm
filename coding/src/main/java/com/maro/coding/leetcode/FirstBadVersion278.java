package com.maro.coding.leetcode;

public class FirstBadVersion278 extends VersionControl {
    // https://leetcode.com/problems/first-bad-version/?envType=study-plan&id=algorithm-i
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

}
