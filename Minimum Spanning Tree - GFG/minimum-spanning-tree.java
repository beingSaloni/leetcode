// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.spanningTree(V, adj));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution
{
     class Pair implements Comparable<Pair> {
        
        int vertex;
        int cost;
        
        Pair(int vertex , int cost){
            
            this.vertex =vertex ;
            this.cost =cost;
        }
        
        public int compareTo(Pair p){
            
            return this.cost - p.cost;
        }
        
    }
    
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        
         int[] costs = new int[V];
        Arrays.fill(costs,-1);
        int sum = 0 ;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        
        pq.add(new Pair(0,0));
        
        while(!pq.isEmpty()){
            
            Pair currentPair = pq.remove();
            
            int currV = currentPair.vertex;
            
            int currC = currentPair.cost;
            
            
            if(costs[currV] != -1){
                continue;
            }
            
            costs[currV] = currC ;
            
            ArrayList<ArrayList<Integer>> neighbours = adj.get(currV);
            
            for(ArrayList<Integer> current : neighbours){
                
                int currNeigh = current.get(0);
                int currEdgeCost = current.get(1);
                
                pq.add(new Pair(currNeigh, currEdgeCost));
                
            }
            
            
        }
        for(int ele : costs){
            
            sum+=ele;
        }
        
        
        return sum;
        
        
    
        
    }
}
