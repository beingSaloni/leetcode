class Solution {
    public int minOperations(int[] nums, int x) {
        
        int result = nums.length +1;
        
        int sum = 0 ;
        
        HashMap<Integer, Integer> memo = new HashMap<>();
        
        memo.put(0,-1);
       
        for(int i  = 0 ; i < nums.length ; i++){
            
            sum+=nums[i];
            
            memo.put(sum,i);
            
            
        }
        
        sum =  0;
        
        for(int i = nums.length-1 ; i>= 0 ; i--){
            
            if(memo.containsKey(x-sum)){
                
                result = Math.min(result,nums.length-i+memo.get(x-sum)) ;
            }
            
            sum+=nums[i];
            
        }
        
       if(result == nums.length+1){
           return -1;
       }
        return result;
    }
}