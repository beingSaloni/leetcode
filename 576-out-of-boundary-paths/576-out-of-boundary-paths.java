class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        
         long[][][] dp = new long[m][n][maxMove + 1];
        
        for(long[][] e1: dp) {
            for(long[] e2: e1) {
                Arrays.fill(e2, -1);
            }
        }
       return solve(m,n,maxMove,startRow,startColumn, dp);
    }
    
    public static int solve(int m, int n, int maxMove, int startRow, int startColumn, long[][][] memo){
        
        if(startColumn>=n || startRow>=m || startColumn<0 || startRow<0){
                  return 1;
        }
        if(maxMove<=0){
            return 0;
        }
        
        
        if(memo[startRow][startColumn][maxMove] != -1){
            
            
            return (int)memo[startRow][startColumn][maxMove];
        }
        long up = solve(m,n,maxMove-1,startRow-1,startColumn, memo)% 1_000_000_007;
        long down = solve(m,n,maxMove-1,startRow+1,startColumn, memo)% 1_000_000_007;
        long right =solve(m,n,maxMove-1,startRow,startColumn+1, memo)% 1_000_000_007;
        long left = solve(m,n,maxMove-1,startRow,startColumn-1, memo)% 1_000_000_007;
        
        long ans = (up + down + right + left) % 1_000_000_007 ;
        
       memo[startRow][startColumn][maxMove] = ans;
        
        return (int)ans;
        
    }
    
}