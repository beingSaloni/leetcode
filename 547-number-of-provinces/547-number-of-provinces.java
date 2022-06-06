class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        boolean[] visited = new boolean[isConnected.length];
        int ans = 0 ;
        
        for(int i = 0 ; i <visited.length ;i++){
         
            if(visited[i] == true){
                continue;
            }
            // System.out.println("ii");
            ans++;
            dfs(visited,isConnected,i);
            
        }
        
        
       return ans; 
        
    }
    
    public static void dfs( boolean[] visited , int[][] isConnected , int vertex){
        
       if(visited[vertex]){
            return;
       }
        
        visited[vertex] = true;
        
        for(int i = 0 ; i < isConnected.length ; i++){
            
            if(isConnected[vertex][i] ==1){
                
                dfs(visited,isConnected,i);
                
            }
            
        }
        
        
    }
    
}