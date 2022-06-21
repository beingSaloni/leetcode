class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
        int[][] cost = new int[n][n];
        
       // source , dest ,cost
        
        for(int i = 0 ; i < n ; i++){
             Arrays.fill(cost[i],Integer.MAX_VALUE);
        }
        
        for(int i = 0 ; i< edges.length ; i++){
            
            cost[edges[i][0]][edges[i][1]] = edges[i][2];
            cost[edges[i][1]][edges[i][0]] = edges[i][2];
            
            
        }
        
        for(int i = 0 ; i <n ; i++){
            cost[i][i] = 0;
//             for(int j = 0 ; j < n ; j++){
                
//                 System.out.print(cost[i][j] + " ");
                
//             }
//              System.out.println();
            
        }
        
        for(int intermediary = 0 ; intermediary< n ; intermediary++ ){
            
            for(int source = 0 ; source<n ; source++){
                
                for(int dest = 0 ; dest< n ; dest++){
                    
                    if(cost[source][intermediary] != Integer.MAX_VALUE && cost[intermediary][dest] != Integer.MAX_VALUE){
                        
                        cost[source][dest]= Math.min( cost[source][dest] , cost[source][intermediary] + cost[intermediary][dest]);
                    }
                    
                }
                
            }
            
        }
        
        int[][] neigh = new int[n][2];
        
        for(int i = 0 ; i<n ; i++){
            neigh[i][1] = i ;
            for(int j = 0 ; j<n ; j++){
                
                if(cost[i][j] <= distanceThreshold){
                    
                 // System.out.print(cost[i][j] +" " + i +" "+ j);
            
                    neigh[i][0]++;
                }
                 // System.out.println();
            }
//             System.out.println(neigh[i][0]);
            
            
        }
        
        Arrays.sort(neigh,(a, b) -> b[0]- a[0]);
        
//         for(int i = 0 ; i<n ; i++){
            
//             System.out.println(neigh[i][1] + " "+ neigh[i][0]);
            
            
//         }
        
        
        return neigh[neigh.length-1][1];
        
       
        
        
    }
}