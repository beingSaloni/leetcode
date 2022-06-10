// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        int[] inDegree = new int[V];
        
        Queue<Integer> q = new LinkedList<>();
        
        int visitedVertex = 0;
        
        boolean[] visited = new boolean[V];
        
        for(int j = 0 ; j<V ; j++){
             
        for(int i = 0 ; i<adj.get(j).size() ; i++){
            
            inDegree[adj.get(j).get(i)]++;
            
        }
        
        }
        
        for(int i = 0 ; i<V ; i++){
            
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        
        while(q.size() > 0){
            
            int currV = q.poll();
            
            if(visited[currV]){
                continue;
            }
            
            visited[currV]=true;
            
             visitedVertex++;
            
            for(int currNeigh : adj.get(currV)){
                inDegree[currNeigh]-- ;
                
                if(inDegree[currNeigh]==0){
                    q.add(currNeigh);
                }
            }
            
            
        }
        
        return !(visitedVertex== V) ;
    }
}