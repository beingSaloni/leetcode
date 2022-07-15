class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] memo = new int[2];
        Arrays.fill(memo,-1);
        solve(nums, target,memo,0,nums.length-1);
        return memo;
    }
    
    public static void solve(int[] nums, int target , int[] memo , int start , int end){
        
        if(start>end){
            
            return;
        }
        
        int mid = start + (end-start)/2 ;
        
        if(nums[mid]==target){
           System.out.println(mid);
            if(memo[0] != -1 ){
                
                if(mid > memo[1]){
                    
                      memo[1]=mid;
                }
                if(mid < memo[0]){
                    memo[0]=mid;
                }
              
            }else{
                
                memo[0]= mid;
                memo[1]= mid;
            }
            
            if(mid+1 < nums.length && nums[mid] == nums[mid+1]){
                solve(nums,target,memo,mid+1,end);
            }
            if(mid-1 >= 0 && nums[mid] == nums[mid-1]){
                  // System.out.println(mid);
                solve(nums,target,memo,start,mid-1);
            }
            return;
        }
        
        if(nums[mid] < target){
           
            solve(nums,target,memo,mid+1,end);
            return;
        }
        
         // System.out.println(nums[mid]);
        solve(nums,target,memo,start,mid-1);
    }
}