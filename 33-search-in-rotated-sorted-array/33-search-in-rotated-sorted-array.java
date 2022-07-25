class Solution {
    public int search(int[] nums, int target) {
        
     return   binarysearch(nums,target,0,nums.length-1);
    }
    
    public int binarysearch(int[] nums , int target , int start , int end){
        
        if(start > end){
            
            
            
            return -1;
        }
        int mid = start + (end - start)/2 ;
        if(nums[start] == target){
                return start ;
            }
            if( nums[end] == target){
                return end ;
            }
       
        
        if(nums[mid]==target){
            
            return mid ;
        }
        
        // start < nums[mid] 
        
        // nums[mid] < end
        
        if(nums[start] < nums[mid] ){
     // first side is sorted       
            if(nums[mid] > target && target >= nums[start] ){
                return binarysearch(nums, target , start , mid-1);
            }
            
            return  binarysearch(nums, target , mid+1 , end);
            
        }
   // second side is sorted
        
        if(nums[mid] < target && target <= nums[end] ){
            return binarysearch(nums, target , mid+1 , end);
        }
        
          return binarysearch(nums, target , start , mid-1);
        
        
        
        
    }
    
}