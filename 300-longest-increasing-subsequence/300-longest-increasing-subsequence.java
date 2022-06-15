class Solution {
    public int lengthOfLIS(int[] nums) {
        
        
//         HashMap<String, Integer> memo = new HashMap<>();
        
        int[][] memo =  new int[nums.length][nums.length+1] ;
        
        for(int i = 0 ; i <nums.length ; i++){
            
            for(int j = 0 ; j < nums.length+1 ; j++){
                
                memo[i][j] = -1;
            }
        }
        
       return length(nums, 0 ,-1,memo);
        
    }
    
    public static int length(int [] nums , int i , int pi, int[][] memo){
        
        if(i>= nums.length){
            
            return 0;
        }
        
//         String s = i + " " + pi ;
//         if(memo.containsKey(s)){
            
            
//             return (int)memo.get(s);
//         }
        
        if(memo[i][pi+1] != -1){
            
            return memo[i][pi+1];
        }
        
        int c = 0 ;
        
        if( pi == -1  || nums[pi] < nums[i]){
             
            c = 1 + length(nums,i+1,i,memo);
            
        }
        
        
        int nc = length(nums, i+1 , pi,memo);
        
        // memo.put(s,Math.max(c,nc));
        int ans =  Math.max(c,nc);
        memo[i][pi+1] = ans;
        return ans;
        
        
    }
    
}