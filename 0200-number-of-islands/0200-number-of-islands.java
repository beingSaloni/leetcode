class Solution {
    public int numIslands(char[][] grid) {
        
        int ans = 0;
        for(int i = 0 ; i < grid.length ; i++){
            
            for(int j = 0 ; j < grid[0].length ;j++){
                
                if(grid[i][j] == '1'){
                    dfs(grid,i,j);
                   ans++; 
                }
                
            }
            
        }
      
        return ans;
    }
    
    public static void dfs(char[][] grid , int row, int col){
        
        if(row >= grid.length || col >= grid[0].length || row < 0 || col < 0){
            
            return ;
        }
        
        if(grid[row][col] != '1'){
            
            return ;
        }
        
        grid[row][col] = '0';
        
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
        
        
        
    }
    
    
    
}