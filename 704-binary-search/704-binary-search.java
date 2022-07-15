class Solution {
    public int search(int[] nums, int target) {
        
     return  bs(nums, target , 0 , nums.length-1);
    }
    
    public static int bs(int[] nums , int t , int s , int e){
        
        int mid = s + (e - s)/2 ;
        
        if(s>e ){
            return -1;
        }
        
        if(nums[mid] == t){
                return mid;
        }
    
        
        if(nums[mid] < t){
            return bs(nums, t , mid+1 , e);
        }
        
      
            return bs(nums, t, s , mid-1);
        
        
        
        
        
    }
    
}