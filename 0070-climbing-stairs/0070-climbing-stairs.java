class Solution {
    public int climbStairs(int n) {
        
        int[] arr = new int[n + 1];
        Arrays.fill(arr , -1);
       return solve( n ,0 , arr);
        
    }
    
    private int solve(int n , int s , int[] arr){
         if(n < s){
            return 0;
        }
        if(arr[s] != -1){
            
            return arr[s];
        }
        
        if(n==s){
            return 1;
        }
        
       
        int ans = solve(n , s +1 , arr) + solve( n , s +2 , arr);
        arr[s] = ans;
      return  ans;
        
    }
    
}