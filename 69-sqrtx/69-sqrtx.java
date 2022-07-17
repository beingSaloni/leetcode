class Solution {
    public int mySqrt(int x) {
        
          int[] memo = new int[1];
        memo[0]=-1;
        binarySearchFirst(memo,x, 0 ,x );
        
        return memo[0];
    }
    void binarySearchFirst(int[] memo , int n , int start, int end){
        
        
        
        if(start > end){
            return;
        }
        
        int mid = start + (end-start)/2 ;
        
    
        
        if(mid==0 || mid <= n/mid){
          
             memo[0] = mid;
            binarySearchFirst(memo,n, mid+1 ,end);
           
            return;
            
        }
        binarySearchFirst(memo,n, start , mid-1);
       
           
       
         
        
    }
}