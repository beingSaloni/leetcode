class Solution {
    public int uniquePathsWithObstacles(int[][] obs) {
         
        HashMap<String,Integer> memo = new HashMap<>();
       return unique(0,0,obs,memo);
    }
    
    public static int unique(int r ,int c , int[][] obs ,HashMap memo){
        
        
        if(r >= obs.length || c>= obs[0].length){
            
            return 0;
        }
        if(obs[r][c] == 1){
            return 0;
        }
        
        
        if(obs.length-1 == r && obs[0].length-1==c){
            return 1;
        }
        String s = r + " " + c;
        if(memo.containsKey(s)){
            return (int)memo.get(s);
        }
        
        
        int right = unique(r , c+1, obs,memo);
        
        int left = unique(r+1, c,obs,memo);
        
        
        memo.put(s,right+left);
        return right + left ;

    }
    
}