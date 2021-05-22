package leetcode;

public class Q1480 {

    class Solution {
        public int[] runningSum(int[] nums) {

            int a = nums[0];
            for(int i =1 ; i< nums.length ; i++){

                a= a + nums[i];
                nums[i] = a ;
            }

            return nums ;
        }
    }
}
