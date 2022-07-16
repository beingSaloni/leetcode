/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
       int[] memo = new int[1];
        memo[0]=-1;
        binarySearchFirst(memo,n, 0 ,n);
        
        return memo[0];
    }
    void binarySearchFirst(int[] memo , int n , int start, int end){
        
        if(start > end){
            return;
        }
        
        int mid = start + (end-start)/2 ;
        
        if(isBadVersion(mid)){
          
             memo[0] = mid;
            binarySearchFirst(memo,n, start , mid-1);
           
            return;
            
        }
        
       binarySearchFirst(memo,n, mid+1 ,end);
           
       
         
        
    }
    
}