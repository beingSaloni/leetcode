class Solution {
    public int closedIsland(int[][] grid) {
        
        int ans = 0;
        
        for(int i = 0 ; i < grid.length ; i++){
            if(grid[i][0] == 0){ 
            dfs(grid,i,0);
            }
             if(grid[0][i] == 0){
            dfs(grid,0,i);
             }
            if(grid[i][grid[0].length-1] == 0){ 
            dfs(grid,i,grid[0].length-1);
            }
             if(grid[grid.length-1][i] == 0){
            dfs(grid,grid.length-1,i);
             }
            
            
        }
        
        for(int i = 1 ; i< grid.length-1; i++){
            
            for(int j= 1 ; j<grid[0].length-1 ;j++){
                
                if(grid[i][j] == 0){
                    dfs(grid,i,j);
                    ans++;
                }
            }
            
            
        }
        
        return ans;
    }
    
    
    public static void dfs(int[][] grid , int row, int col){
        
        if(row >= grid.length || col >= grid[0].length || row < 0 || col < 0){
            
            return ;
        }
        
        if(grid[row][col] == 1){
            
            return ;
        }
        
        grid[row][col] = 1;
        
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
        
        
        
    }
}