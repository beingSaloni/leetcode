class Solution {
    
    public class Pair{
        
        int value ;
        int currColor;
        
        Pair(int V , int currColor){
            
            this.value = V ;
            this.currColor = currColor;
        }
        
    }
    
    public boolean possibleBipartition(int n, int[][] dislikes) {
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
       for(int i = 0 ; i <n ; i++){
            
          graph.add(new ArrayList<>());
            
        }
        
        for(int i = 0 ; i < dislikes.length ; i++){
            
            graph.get(dislikes[i][1]-1).add(dislikes[i][0]-1);
             graph.get(dislikes[i][0]-1).add(dislikes[i][1]-1);
            
            
        }
//         for(int i = 0 ; i < n ; i++){
            
//             for(int j = 0 ; j < graph.get(i).size();j++){
                
//                 System.out.print(graph.get(i).get(j));
//             }
            
//             System.out.println();
//         }
        
        int[] colors = new int[n];
        
        Arrays.fill(colors,-1);
        
        for(int i = 0 ; i < n ; i++){
            
            if(colors[i] == -1){
                
                if(!bfs(colors,graph,i)){
                      return false;
                }
            }
            
        }
        
        return true;
        
        
    }
    
    public boolean bfs(int[] colors , ArrayList<ArrayList<Integer>> graph , int V ){
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(V,0));
        
        
        while(q.size() > 0){
            
            int size = q.size();
            Pair currNode = q.poll();
            colors[currNode.value] = currNode.currColor ;
           
               
                for(int i = 0; i< graph.get(currNode.value).size() ; i++){
                    
                    if((colors[graph.get(currNode.value).get(i)])==-1){
                        
                        q.add(new Pair( graph.get(currNode.value).get(i), 1- currNode.currColor));
                    }else{
                        
                        if(colors[graph.get(currNode.value).get(i)] == currNode.currColor){
                            // System.out.println(Neigh);
                            return false;
                        }
                        
                    }
                    
                }
                
            
                 
        }
            
            
          return true;              
            
            
    }
}

















