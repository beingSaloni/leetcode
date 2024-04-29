class Solution {
    public int minOperations(int[] nums, int k) {
        
        int resultXOR = 0;
        
        int count = 0 ;
        
        for(int i = 0 ; i < nums.length ; i++){
            
            resultXOR = resultXOR ^ nums[i];
            
        }
        
        while(resultXOR != 0 || k != 0){
            
            if(resultXOR%2 != k %2){
                
                count++;
            }
            
            resultXOR = resultXOR/2 ;
            k = k/2;
            
        }
        
        return count ;
        
    }
}