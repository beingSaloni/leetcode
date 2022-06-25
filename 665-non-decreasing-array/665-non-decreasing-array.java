class Solution {
    
    // [3,4,2,3]
    // 3 3 2 3   
    
    // 4 2 3
    // 2 2 3
    public boolean checkPossibility(int[] nums) {
        
        int count = 0 ;
        
        for(int i = 1 ; i<nums.length ; i++){
            
            if(nums[i-1] > nums[i]){
                if(i == 1 || nums[i-2] <= nums[i]){
                    nums[i-1] = nums[i];
                }else{
                nums[i] = nums[i-1];
                }
                count++;
                
            }
//              if(nums[i] > nums[i+2]){
//                 nums[i] = nums[i+1];
//                 count++;
                
//             }
            if(count > 1){
                return false;
            }
        }
        
        
        return true;
    }
}