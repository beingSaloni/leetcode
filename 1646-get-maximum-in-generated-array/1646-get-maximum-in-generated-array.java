class Solution {
    public int getMaximumGenerated(int n) {
        // 0 1 1 2 1 3 2 3
        int[] ans = new int[1];
        int [] memo = new int[n + 1];
        
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        Arrays.fill(memo,-1);
        memo[0] = 0 ;
        memo[1] = 1;
       ans[0] = 1; 
        
             solve(n  , ans , memo);
        for(int i = n ; i >= 0 ; i--){
            if(memo[i] == -1){
                solve(i, ans , memo);
            }
            // System.out.println(memo[i]);
        }
       
       return ans[0];
    }
    
    public static int solve(int n , int[] ans, int [] memo){
      
        if(n==0){
            
            return 0;
        }
        
        if(n==1){
            return 1;
        }
        
        if(memo[n] != -1){
            
            return memo[n];
        }
       
        
        
        if(n%2==0){
            if(memo[n/2] != -1){
                memo[n] = memo[n/2];
            }else{
            int sol =solve(n/2 , ans, memo) ;
         
             ans[0] = Math.max(sol,ans[0]);
                memo[n] = sol;
            }
        return memo[n];
            
        }
       int sol = solve(n/2, ans, memo) + solve(n/2 + 1, ans, memo);
         
        ans[0] = Math.max(sol,ans[0]);
        memo[n] = sol ;
        return memo[n] ;
    
       
        
        
    }
    
}