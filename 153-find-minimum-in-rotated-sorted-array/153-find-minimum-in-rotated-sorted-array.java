class Solution {
    public int findMin(int[] nums) {
       // if left side of the elememt > element---> retuen that element
        
         return   binarysearch(nums,0,nums.length-1);
        
        
    }
    
     public int binarysearch(int[] nums , int start , int end){
        
        if(start > end){
            
            
            
            return -1;
        }
         if(start==end){
             
             return nums[start];
         }
        int mid = start + (end - start)/2 ;
        if(nums[start] < nums[end]){
                return nums[start] ;
            }
            if( nums[mid] > nums[mid+1]){
                return nums[mid + 1] ;
            }
       
        
        if(nums[mid-1] > nums[mid]){
            
            return nums[mid] ;
        }
        
        // start < nums[mid] 
        
        // nums[mid] < end
        
        if(nums[start] < nums[mid] ){
     // first side is sorted       
            
            
            return  binarysearch(nums,  mid+1 , end);
            
        }
   // second side is sorted
        
        
        
          return binarysearch(nums, start , mid-1);
        
        
        
        
    }
}