// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j]  =Integer.parseInt(s[j]);
            }
            Solution obj = new Solution();
            obj.shortest_distance(matrix);
            for(int i = 0; i < n; i++){
                for(int j  = 0; j < n; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
    public void shortest_distance(int[][] matrix)
    {
        // Code here 
        int V = matrix.length ;
        
        int[][] cost = new int[V][V];
         
        for(int i = 0 ; i < V ; i++){
            
            for(int j = 0 ; j<V ; j++){
                
                if(matrix[i][j] == -1){
                    cost[i][j] = Integer.MAX_VALUE;
                    
                }else{
                    
                    cost[i][j] = matrix[i][j];
                    
                }
                
            }
            
        }
        
        for(int intermediary = 0 ; intermediary< V ; intermediary++ ){
            
            for(int source = 0 ; source<V ; source++){
                
                for(int dest = 0 ; dest< V ; dest++){
                    
                    if(cost[source][intermediary] != Integer.MAX_VALUE && cost[intermediary][dest] != Integer.MAX_VALUE){
                        
                        cost[source][dest]= Math.min( cost[source][dest] , cost[source][intermediary] + cost[intermediary][dest]);
                    }
                    
                }
                
            }
            
        }
        
         for(int i = 0 ; i < V ; i++){
            
            for(int j = 0 ; j<V ; j++){
                
                if(cost[i][j] == Integer.MAX_VALUE){
                    matrix[i][j] = -1;
                    
                }else{
                    
                    matrix[i][j] = cost[i][j];
                    
                }
                
            }
            
        }
        
        
        
        
    }
}