package leetcode;

public class Q1470 {

    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int i = 0;
            int c =0 ;
            int [] ne = new int[nums.length];
            while(i < nums.length){
                ne[i] =nums[c];
                i++;
                ne[i] = nums[n+c];
                i++;
                c++;
            }

            return ne ;
        }
    }
}
