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
        
        boolean[] visited = new boolean[V];
        for(int i = 0 ; i<V ; i++){
            
            if(!visited[i]){
               if(dfs(visited,adj,new boolean[V] , i)){
                   return true;
               }
            }
            
        }
       
       return false; 
        // code here
    }
    
     public static boolean dfs(boolean[] visited,ArrayList<ArrayList<Integer>> adj , boolean[] check, int index ){
        
       
        
        visited[index]=true;
        check[index] = true;
       
        for(int i = 0 ; i<adj.get(index).size() ; i++){
            
            if(!visited[adj.get(index).get(i)]){
                
            // check[adj.get(index).get(i)] = true;
            
            if(dfs(visited,adj,check,adj.get(index).get(i))){
                
                return true;
            }
            }
            
            else if(check[adj.get(index).get(i)]){
                return true;
            }
            
        }
        
        check[index] = false;
        
        return false;
        
    } 
    
    
    
}
