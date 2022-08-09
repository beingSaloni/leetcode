class Solution {
    public int longestIdealString(String s, int k) {
        
        
      return  solve(s , k , 0 , ' ' ,new int[s.length()][26]);
        
    }
    
    private int solve(String s , int k , int index , char prev , int[][] memo){
        
        if(index >= s.length()){
            
            
            return 0;
        }
        
       
     int ch =  prev - 'a' ;
        
        if(ch > -1 && memo[index][ch] != 0){
            
            if(memo[index][ch] == -1){
                
                return 0;
            }
            
            return memo[index][ch];
        }
        
          int consider = 0 ;
        
        if(index == 0 || prev == ' ' || Math.abs(prev - s.charAt(index)) <= k){
      consider = 1 + solve(s , k , index + 1 , s.charAt(index) , memo);
        }
        
        int not = solve(s , k , index +1 , prev , memo);
        
        int ans = Math.max(consider , not);
        if(ans==0){
              if(ch > -1){
            memo[index][ch] = -1 ;
              }
        }else{
            
            if(ch > -1){
            memo[index][ch] = ans;
            }
        }
        return ans;
        
        
    }
    
    
}