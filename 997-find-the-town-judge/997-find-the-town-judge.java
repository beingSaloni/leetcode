class Solution {
    public int findJudge(int n, int[][] trust) {
        
        
        int[] indegree = new int[n+1] ;
        int[] outdegree = new int[n+1];
        
        for(int i = 0 ; i < trust.length ;i++){
            
            indegree[trust[i][1]]++;
            outdegree[trust[i][0]]++;
            
        }
        
        for(int i = 1 ; i<= n ; i++){
            
            if(indegree[i] == n-1 && outdegree[i] == 0){
                return i;
            }
            // System.out.println(indegree[i] + " " + outdegree[i]);
        }
        
        return -1;
    }
}