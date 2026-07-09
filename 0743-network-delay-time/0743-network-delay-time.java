class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

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