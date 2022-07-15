class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        
   
        int currmax =0;
        int max =0 ;
        for(int i = 0 ; i < grid.length ; i++){
            
            for(int j = 0 ; j < grid[0].length ; j++){

            
                if(grid[i][j] == 1){
                    
                    
                   currmax= dfs(grid,i,j);
                    
                    max= Math.max(currmax,max);
                    
                }
                
            
            }
                    
        }
        
        return max;
    }
    
    public static int dfs(int[][] grid , int row , int col ){
        
        if(row >= grid.length  || col >= grid[0].length || row < 0 || col < 0 || grid[row][col] == 0){
            
            return 0;
        }
        
        grid[row][col] = 0;
        
       int forward= dfs(grid,row+1,col);
        int downward= dfs(grid,row,col+1);
        int backward= dfs(grid,row-1,col);
        int upward = dfs(grid,row,col-1);
        
        return  1 + forward +downward + backward + upward ;
    }
    
    
}