class Solution {
    public int[][] findFarmland(int[][] land) {
        
        ArrayList ans = new ArrayList<>();
        
        for(int i = 0 ; i < land.length ; i++){
            
            for(int j  =0 ; j < land[0].length ; j++){
               
                if(land[i][j] == 1){
                     int[]anss = new int[4];
                    anss[0] = i ;
                    anss[1] = j ;
                    
                    solve(land , i ,j , anss);
                  ans.add(anss);
                }
                
              
                
            }
            
            }
        int[][] result = new int[ans.size()][2] ;
        
        for(int i = 0 ; i < ans.size() ; i++){
            
            result[i] = (int[])ans.get(i);
            
        }
        return result;
        
    }
    
    
    public void solve(int[][] land , int i , int j , int[] anss){
        
        if(i < 0 || j < 0 || land.length <= i || land[0].length <= j || land[i][j] == 0){
            
            
            
            return ;
        }
        
        anss[2] = Math.max(anss[2] , i);
            
            anss[3] = Math.max(anss[3] , j) ;
        
        land[i][j] = 0 ;
        
        solve(land , i+1 , j , anss);
        solve(land , i-1 , j , anss);
        solve(land , i , j+1 , anss);
        solve(land , i , j-1 , anss);
        return  ;
        
    }
    
    
    
    
}