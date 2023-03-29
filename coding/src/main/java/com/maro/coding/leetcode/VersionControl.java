package com.maro.coding.leetcode;

/* FirstBadVersion278 문제의 외부 api를 구현할 상위 클래스 */
public class VersionControl {
    int bad =1;

    public void setBad(int bad){
        this.bad = bad;
    }

    public boolean isBadVersion(int i) {
        if(i >= bad){
            return true;
        }
        return false;
    }
}
