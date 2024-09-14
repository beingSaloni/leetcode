class Solution {
    public int longestSubarray(int[] nums) {
        
        int ans = 1 ;
        
        int streak = 1;
        
        int max = nums[0];
        
        for(int i = 1 ; i < nums.length ; i++){
            
            if(nums[i] > max){
                max = nums[i];
                streak = 1;
                ans = 1;
                max = nums[i];
            }else if(nums[i] == max ){
                streak++;
            }else{
                
                ans = Math.max(ans , streak);
                streak = 0;
            }
            
            
            
        }
        ans = Math.max(ans , streak);
        return ans;
        
    }
}