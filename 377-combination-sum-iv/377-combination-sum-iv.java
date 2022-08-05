class Solution {
    public int combinationSum4(int[] nums, int target) {
        
       return solve(nums, target, 0 , new HashMap<String , Integer>());
    }
    
    
    public int solve(int[] nums ,int target , int index , HashMap memo){
        
        if(target==0){
            
            return 1;
        }
        
        if(nums.length <= index || target < 0){
            
            
            return 0;
        }
        
        
        String st = target + " " + index ;
        if(memo.containsKey(st)){
           return (int)memo.get(st);
        }
        
        int consider = solve(nums , target - nums[index] , 0 , memo);
        
        int nc = solve(nums , target , index + 1 , memo);
        
        memo.put(st , consider + nc);
        
        return consider + nc ;
        
        
        
        
        
        
        
        
    }
    
    
}