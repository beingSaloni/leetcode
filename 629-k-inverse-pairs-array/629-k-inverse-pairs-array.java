class Solution {
   
        
        // 1 2 3
        // 2 1 3
        // 3 1 2
        // 1 3 2
        // 2 3 1
        // 3 2 1
        
        // remove all the permutations 
        // count how many inverse are there in each of it
        // if k==cout; ans++
        
        // redo it 
        public static int kInversePairs(int n, int k) {
        int mod = 1000000007;
        if (k > n*(n-1)/2 || k < 0) return 0;
        if (k == 0 || k == n*(n-1)/2) return 1;
        long[][] dp = new long[n+1][k+1];
        dp[2][0] = 1;
        dp[2][1] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i][0] = 1;
            for (int j = 1; j <= Math.min(k, i*(i-1)/2); j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
                if (j >= i) dp[i][j] -= dp[i-1][j-i];
                dp[i][j] = (dp[i][j]+mod) % mod;
            }
        }
        return (int) dp[n][k];
    }
        
    
}