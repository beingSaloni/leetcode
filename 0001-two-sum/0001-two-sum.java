class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> memo = new HashMap<>();
        
        int[] ans = new int[2];
        
        for(int i = 0 ; i < nums.length ; i++){
            
            int rem = target - nums[i];
            
            if(memo.containsKey(rem)){
                
                ans[0] = memo.get(rem);
                ans[1] = i;
                return ans;
            }
            
            memo.put(nums[i] , i);
            
        }
        
        return ans;
        
    }
}