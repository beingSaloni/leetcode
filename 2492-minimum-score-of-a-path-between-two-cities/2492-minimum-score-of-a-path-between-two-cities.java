class Solution {
    public class graph{
        int des;
        int dis;
        graph(int des , int dis){
            this.des = des;
            this.dis = dis;
        }
    }
    public int minScore(int n, int[][] roads) {
        
        int[] visited = new int[n+1 ];
        
        ArrayList<ArrayList<graph>> list = new ArrayList<>();
        
        for(int i = 0 ; i < n + 1 ; i++){
            
            list.add(new ArrayList<graph>());
            
        }
        
        for(int i= 0 ; i < roads.length ; i++){
            graph temp = new graph(roads[i][1] , roads[i][2]);
            list.get(roads[i][0]).add(temp) ;
            
            temp = new graph(roads[i][0] , roads[i][2]  );
            list.get(roads[i][1]).add(temp);
            
        }
        int[] min = new int[1];
        min[0] = 100000 ;
        dfs(roads, 1, visited , list , min);
        return min[0];
    }
    
    private void dfs(int[][] roads , int index , int[] vis ,  ArrayList<ArrayList<graph>>  list , int[] min){
        
        // if(vis[index] == 1){
        //     // System.out.println(index);
        //     return;
        // }
        vis[index] = 1;
       
        
        for(int i = 0 ; i < list.get(index).size() ; i++){
            

            
             min[0] = Math.min(min[0] , list.get(index).get(i).dis);
            
            if(vis[ list.get(index).get(i).des ] ==1){
                continue;
            }
            
         dfs(roads, list.get(index).get(i).des , vis , list, min);
            // System.out.println(min[0]);
        }
        
         // System.out.println(index);
        
        
        
    }
}