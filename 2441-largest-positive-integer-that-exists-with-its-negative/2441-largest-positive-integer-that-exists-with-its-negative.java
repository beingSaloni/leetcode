class Solution {
    public int findMaxK(int[] nums) {
        
     ArrayList<Integer> memo = new ArrayList<>();
        int ans = -1 ;
        
        for(int i = 0 ; i < nums.length ; i++){
            
           if(memo.contains(0-nums[i])){
               ans = Math.max(ans , Math.abs(nums[i]));
           }
            
            memo.add(nums[i]);
            
        }
        
        return ans;
        
        
    }
}