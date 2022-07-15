class Solution {
    public int search(int[] nums, int target) {
        
     return  bs(nums, target , 0 , nums.length-1);
    }
    
    public static int bs(int[] nums , int t , int s , int e){
        
        int mid = s + (e - s)/2 ;
        
        if(nums[mid] == t){
                return mid;
        }
        
        if( e <= s ){
           return -1 ;
        }
        
        if(s + 1 == e){
            if(nums[s] == t){
               return s;
            }
            if(nums[e] == t){
                return e;
            }
            return -1;
        }
        
        if(nums[mid] < t){
            return bs(nums, t , mid , e);
        }
        
        if(nums[mid]>t){
            return bs(nums, t, s , mid);
        }
        
        
        return -1;
        
    }
    
}