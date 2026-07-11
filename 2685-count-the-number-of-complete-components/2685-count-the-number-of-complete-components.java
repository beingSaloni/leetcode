class Solution {
    public int countCompleteComponents(int n, int[][] edges) {

        List<Integer>[] graph = new ArrayList[n];

        for(int i = 0 ; i < n ; i++){

            graph[i] = new ArrayList<>();

        }

        for(int[] edge : edges){

            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        int ans =  0 ;

        Set<Integer> vis = new HashSet<>();

        for(int v = 0 ; v < n ; v++){

            if(vis.contains(v)) continue ;

            int[] info = new int[2];

            dfs(v , graph , vis , info);


            if((info[0]*(info[0]-1))  == info[1]){

                ans++;
            }






        }


        return ans;

        
    }

    private void dfs(int curr , List<Integer>[] graph , Set<Integer> vis , int[] info){

        vis.add(curr);
        info[0]++; 

        info[1] = info[1] + graph[curr].size();

        for(int next : graph[curr]){

            if(!vis.contains(next)){

                dfs(next , graph , vis , info);
            }



        }



    }



}