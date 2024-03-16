class Solution {
    public int findMaxLength(int[] nums) {
        
        int sum = 0 ;
        
        int ans =0;
        
        HashMap<Integer, Integer> memo = new HashMap<>();
        
        
        
        for(int i = 0 ; i< nums.length ; i++){
            
            if(nums[i] == 0){
                
                sum--;
            }else{
                
                sum++;
            }
            
            if(memo.containsKey(sum)){
                
              ans = Math.max(ans, i - memo.get(sum));
                
                
            }else{
            
            memo.put(sum,i);
                
            }
            
            if(sum == 0){
                
                ans = i + 1;
            }
            
            
            
        }
        
        return ans;
        
    }
}