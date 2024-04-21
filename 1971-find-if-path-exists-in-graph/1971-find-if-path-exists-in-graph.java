class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i = 0 ; i < n ; i++){

            graph.add(new ArrayList<>());
        }
        for(int i = 0 ; i < edges.length ; i++){

            graph.get(edges[i][0]).add(edges[i][1]);
             graph.get(edges[i][1]).add(edges[i][0]);
        }


        int[] vis = new int[n];
        if(dfs(source , destination , graph , vis)){
            return true;
        }

        return false;
    }

    private boolean dfs(int s , int d , ArrayList<ArrayList<Integer>> graph , int[] vis){

        if(s == d){
            return true;
        }
        if(vis[s] == 1){
            return false;
        }
        vis[s] = 1;

    

        for(int i = 0 ; i < graph.get(s).size() ; i++){

        if(dfs(graph.get(s).get(i) , d , graph , vis)){
            return true;
        }

        }

        return false;




    }


}