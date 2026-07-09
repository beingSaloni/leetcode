class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {


       // The Bellman-Ford algorithm is a powerful tool for finding shortest paths from a single source. It is particularly robust because it can handle graphs with negative edge weights (unlike Dijkstra). The core concept is Relaxation: by checking all edges times, we propagate the shortest distance information across the entire network. Think of it like a water ripples expanding from the source; each iteration allows the "water" to travel one edge further to reach all possible nodes.

        int[] dist = new int[n+1];

        Arrays.fill(dist , Integer.MAX_VALUE);

        dist[k] = 0 ;

        for(int i =1 ; i < n ; i++){

            for(int[] edge : times){

                int source = edge[0] , receiver = edge[1] , width = edge[2];

                if(dist[source] != Integer.MAX_VALUE && dist[source] + width < dist[receiver]){

                    dist[receiver] = dist[source] + width;
                }


            }


        }

        int result = 0 ;

        for(int i = 1 ; i <= n ; i++){

            if(dist[i] == Integer.MAX_VALUE) return -1;

            result = Math.max(result , dist[i]);



        }


        return result ;




        
    }
}