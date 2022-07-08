import java.util.Arrays;

class Solution {

    int n,m;
    long[][][] dp;

    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        this.n = n;
        this.m = m;

        dp = new long[m+1][n+1][2*target+1];

        for(int i=0;i<=m;++i){
            for(int j=0;j<=n;++j){
                Arrays.fill(dp[i][j],-1);
            }
        }

        long ans = rec(houses,cost,0,-1,0,target);

        if(ans>=Integer.MAX_VALUE)
            return -1;

        return (int)ans;
    }

    private long rec(int[] houses, int[][] cost, int idx, int prev,int currCnt ,int target) {

        if(idx==m){
            if(target==currCnt)
                return 0;
            return Integer.MAX_VALUE;
        }

        if(currCnt>target) {
            return Integer.MAX_VALUE;
        }

        if(prev!=-1 && dp[idx][prev][currCnt]!=-1)
            return dp[idx][prev][currCnt];

        long ans = Integer.MAX_VALUE;

        if(houses[idx]!=0){

            if(prev!=houses[idx])
                ans = rec(houses,cost,idx+1,houses[idx],currCnt+1,target);
            else
                ans = rec(houses,cost,idx+1,houses[idx],currCnt,target);

            if(prev !=-1)
                return dp[idx][prev][currCnt] = ans;

            return ans;
        }

        for(int i=0;i<n;++i){

            int cntDis = currCnt;
            if(prev != i+1)
                cntDis++;

            houses[idx] = i+1;
            ans = Math.min(ans, cost[idx][i] + rec( houses,cost,idx+1,i+1,cntDis,target ) );

            houses[idx] = 0;
        }

        if(prev !=-1)
            return dp[idx][prev][currCnt] = ans;

        return ans;
    }
}