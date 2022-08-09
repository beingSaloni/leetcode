class Solution {
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        
        int[] visited = new int[n]; 
        
        HashSet<Integer> res = new HashSet<>();
        for (int node : restricted) res.add(node);
        ArrayList<ArrayList<Integer>> graph  = new ArrayList<>();
        
          for(int i = 0 ; i < n ; i++){
            
              graph.add(new ArrayList<>());
          
            
        }
        
        for(int i = 0 ; i < edges.length ; i++){
            
            if(res.contains(edges[i][0]) || res.contains(edges[i][1])){
                
                continue;
            }
            
              graph.get(edges[i][0]).add(edges[i][1]);
              graph.get(edges[i][1]).add(edges[i][0]);
          
            
        }
        
        
        int[] count = {0} ;
        
        
        solve(0 , graph, visited , count);
        
        
        return count[0];
        
        
    }
    
    private void solve( int n , ArrayList<ArrayList<Integer>> graph , int[] vis, int[] count){
        
        
        //n = 7, edges = [[0,1],[1,2],[3,1],[4,0],[0,5],[5,6]], restricted = [4,5]
        
       
        
        
        vis[n] = 1;
        
        count[0]++;
      
        
        for(int i = 0 ; i < graph.get(n).size() ;  i++){
            
            
            
                 if(vis[graph.get(n).get(i)] == 1){
            
            continue ;
        }
                solve(graph.get(n).get(i) , graph,  vis , count);
                
            
            
        }
        
        
    }
    
    
    
}