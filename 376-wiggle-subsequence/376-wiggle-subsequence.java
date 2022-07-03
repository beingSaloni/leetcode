class Solution {
    public int wiggleMaxLength(int[] nums) {
        int ans = 1;
        
        int pDiff = 0;
        int i = 0;
        while(i < nums.length-1){
            int diff = nums[i+1] - nums[i];
            if( (diff > 0 && pDiff <= 0) ||
                 (diff < 0 && pDiff >=0) ) {
                ans++;
                pDiff = diff;
            }
            i++;
        }
        return ans;
    }
}