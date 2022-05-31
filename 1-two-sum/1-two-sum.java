class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> memo = new HashMap<>();
        
        for(int i = 0 ; i< nums.length ; i++){
            
            int rem = target - nums[i];
                
            if(memo.containsKey(rem)){
                
                return new int[]{memo.get(rem) , i};
            }
            memo.put(nums[i] , i);
        }
        
        return new int[2];
        
    }
}