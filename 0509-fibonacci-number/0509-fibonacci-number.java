class Solution {
    public int fib(int n) {
        
        int[] memo = new int[n + 1];
        return solve(n , memo );
        
    }
    
    public int solve(int n ,int[] memo){
        
        if(n==0){
            
            return 0;
        }
        
        if(memo[n] != 0){
            
            return memo[n];
        }
        
        if(n==1){
            
            return 1 ;
        }
        
        int ans = solve(n-1 , memo) + solve( n-2 , memo);
        
        memo[n] = ans ;
        
        return ans;
        
    }
}