class Solution {
    public int[][] largestLocal(int[][] grid) {
        
        int[][] ans = new int[grid.length - 2][grid.length-2];
        
        int end = 3 ;
        int start = 0;
        
        
        
        for(int r = 0 ; r < ans.length ; r++){
        
            for(int c = 0 ; c < ans.length ; c++){
                int max = 0;
        for(int i = 0 ; i < 3 ; i++){
            
            for(int j = 0 ; j < 3 ; j++){
                
                
                
                max = Math.max(max , grid[i+r][j+c]);
                
                
                
                
                
                
                
            }
             
            
            
            
        }
            
            
        ans[r][c] = max; 
            
            }      
        
        
        }
        
        return ans;
        
    }
}