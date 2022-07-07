class Solution {
    public boolean isBipartite(int[][] graph) {
        
        // int[] visited = new int[graph.length];
        int[] color = new int[graph.length];
        Arrays.fill(color,-1);
        for(int i = 0 ; i<graph.length ; i++){
            
            if(color[i]==-1){
                if(!bfs(graph,i, color , 0)){
                    return false;
                }
            }
            
        }
        
        return true;
        
    }
    
    public static boolean bfs(int[][] graph, int V, int[]color , int currColor){
        
        
       if(color[V] != -1){
           
           return color[V]==currColor;
       }
         color[V] = currColor ;
        
        for(int i = 0 ; i<graph[V].length ; i++){
            
            
            
            
           if(!bfs(graph,graph[V][i] , color, 1-currColor)){
               
               return false;
           }
            
        }
        
      
        
        return true;
        
    }
    
}