package leetcode;

public class Q1313 {

    class Solution {
        public int[] decompressRLElist(int[] nums) {
            int s = 0;
            for(int i =0 ; i< nums.length ;i++){
                if(i%2==0){
                    s= s+ nums[i];
                }
            }

            int [] r = new int[s];
            int c = 0;
            for(int i =0 ; i< nums.length ;i++){
                if(i%2==1){
                    while(nums[i-1] > 0){
                        r[c] = nums[i];
                        c++;
                        nums[i-1]--;
                    }
                }

            }

            return r;

        }
    }
}
