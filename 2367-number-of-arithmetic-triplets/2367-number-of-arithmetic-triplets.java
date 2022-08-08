class Solution {
    
    private int find(int target , HashMap memo){
        
        if(!memo.containsKey(target)){
            
            return -1;
        }
        
        return (int)memo.get(target);
    }
    
    public int arithmeticTriplets(int[] nums, int diff) {
   
        int ans = 0;
        
        HashMap memo = new HashMap<Integer,Integer>();
        
        for(int i = 0 ; i < nums.length ; i++){
            
           memo.put(nums[i] , i);
            
            
        }
        
        
        
        
        for(int i = 0 ; i < nums.length ; i++){
            
            int j = find(nums[i] + diff , memo) ;
            
            if(j==-1){
                
                continue;
            }
            
            if(find(nums[j] + diff ,  memo) != -1){
                
                ans++;
            }
            
            
        }
        
        return ans;
        
    }
}