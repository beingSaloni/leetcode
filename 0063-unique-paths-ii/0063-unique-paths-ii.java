class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        // either down, right
        HashMap<String,Integer> memo = new HashMap<>();
        
       return solve(obstacleGrid , 0 ,0 , memo);
        
    }
    
    private int solve(int[][] obstacleGrid , int row , int col , HashMap memo){
        
        String val = row + " " + col ;
        if(memo.containsKey(val)){
            
            return (int)memo.get(val);
        }
        
        if(row == obstacleGrid.length-1 && col == obstacleGrid[0].length-1 && obstacleGrid[row][col] == 0 ){
            // System.out.println(row + " " + col);
            return 1;
        }
        
         if(row > obstacleGrid.length-1 || col > obstacleGrid[0].length-1){
            
            return 0;
        }
        
        
        
        if(obstacleGrid[row][col] == 1){
            
            return 0;
        }
        
        int down = solve(obstacleGrid , row+1 , col , memo);
        
        int up = solve(obstacleGrid , row , col+1 , memo);
        
        memo.put(val, down + up);
        
        return down + up ;
        
    }
}