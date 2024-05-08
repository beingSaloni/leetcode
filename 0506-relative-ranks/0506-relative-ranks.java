class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        String ans[] = new String[score.length];
        
        int[] scorecopy =  score.clone();
        
        Arrays.sort(scorecopy) ;
        
        HashMap<Integer, Integer> memo1 = new HashMap<>();
         HashMap<Integer, Integer> memo2 = new HashMap<>();
        
        for(int i = 0 ; i < ans.length ; i++){
            
            memo1.put(score[i] , i);
            memo2.put(scorecopy[i] , ans.length - i);
        }
        
        for(int i = 0 ; i < ans.length ; i++){
            
           ans[memo1.get(score[i])] = "" + memo2.get(score[i]) ;
            
            if(ans[i].equals("1") ){
                ans[i] = "Gold Medal" ;
            }
            
            if(ans[i].equals("2")){
                ans[i] = "Silver Medal" ;
            }
            
            if(ans[i].equals("3")){
                ans[i] = "Bronze Medal" ;
            }
            
            
        }
        
        
        
        return ans;
        
    }
}