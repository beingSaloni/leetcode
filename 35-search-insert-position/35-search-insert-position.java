class Solution {
    public int searchInsert(int[] nums, int target) {
        
         int[] memo = new int[2];
        memo[0]=-1;
        memo[1]=-1;
        binarySearchFirst(memo,nums,target, 0 ,nums.length-1);
        if(memo[1]==-1){
               return memo[0] + 1;
        }
        return memo[0];
    }
    
    void binarySearchFirst(int[] memo , int[] arr , int target, int start, int end){
        
        if(start > end){
            return;
        }
        
        int mid = start + (end-start)/2 ;
        
        if(arr[mid]==target){
          
            while(mid-1 >= 0 && arr[mid-1]==target ){
          
                mid--;
            }
            memo[0] = mid;
            memo[1] =0;
            return;
            
        }
        
        if(arr[mid] > target){
            binarySearchFirst(memo,arr,target, start ,mid-1);
            return ;
        }
        memo[0] = mid;
         binarySearchFirst(memo,arr,target , mid+1 , end);
         return;
        
    }
}