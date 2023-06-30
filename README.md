# ⚙️ Algorithm
알고리즘 구현 레포지토리입니다.

자바로 알고리즘 문제를 해결하며 모든 알고리즘 구현 코드에 대하여 주어진 예시 input, output 에 대한 테스트코드가 작성되어있습니다.

현재까지 leetcode 문제를 풀이하고 있습니다.

[리트코드](https://leetcode.com/yukmaro/)

모든 풀이는 블로그 글을 포스팅하며 정리되고 있습니다.



## 예시
### 코드

``` java
@Component
public class BinarySearch704 {
    // https://leetcode.com/problems/binary-search/?envType=study-plan&id=algorithm-i
    public int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        while (true){
            if (start > end){
                return -1;
            }
            mid= (start+end)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target > nums[mid]){
                start = mid +1;
            } else if (target < nums[mid]) {
                end = mid -1;
            }
        }
    }
}
```

### 테스트 코드
``` java
public class BinarySearch704Test {
    private BinarySearch704 binarySearch = new BinarySearch704();

    @Test
    @DisplayName("제공된 예시1")
    void example_1() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        int output = binarySearch.binarySearch(nums, target);

        assertEquals(4, output);
    }
    @Test
    @DisplayName("예시2 리스트에 값이 없으면 -1")
    void example_2() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;

        int output = binarySearch.binarySearch(nums, target);

        assertEquals(-1, output);
    }

}
```
