class Solution {
    public boolean search(int[] nums, int target) {
        
        int smallest = nums[0] ;
        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i] == target){
                
                return true;

            }
            
            if(i+1 < nums.length && nums[i] > nums[i+1] && smallest < target ){
                
                return false;
            }
        }
        
        return false;
        
    }
}