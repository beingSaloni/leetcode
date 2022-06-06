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
            bfs(visited,isConnected,i);
            
        }
        
        
       return ans; 
        
    }
    
    public static void bfs( boolean[] visited , int[][] isConnected , int vertex){
        
        Queue<Integer> q = new LinkedList<>();
        
        q.add(vertex);
        
        while(q.size() > 0){
            
            int temp= q.poll();
            // System.out.println(temp);
            if(visited[temp] == true){
                continue;
            }
            
            visited[temp] = true ;
             
            for(int i = 0 ; i < isConnected.length ;i++){
                
                if(isConnected[temp][i] == 1){
                    
                    if(!visited[i]){
                    q.add(i);
                       // System.out.println(i);  
                    }
                }
            }
            
        }
        
        
    }
    
}