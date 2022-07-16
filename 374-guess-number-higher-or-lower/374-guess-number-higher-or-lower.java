/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
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
        
        if(guess(mid) == 0){
          
             memo[0] = mid;
           
           
            return;
            
        }
        
        if(guess(mid) == 1){
        
       binarySearchFirst(memo,n, mid+1 ,end);
            return;
        }
        
        binarySearchFirst(memo,n, start , mid-1);
         
        
    }
}