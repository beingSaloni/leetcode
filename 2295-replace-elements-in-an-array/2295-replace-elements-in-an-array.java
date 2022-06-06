class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        
        HashMap<Integer,Integer> memo = new HashMap<>();
        
        
        
        for(int i = 0 ; i < nums.length ; i++){
           
            memo.put(nums[i] , i);            
        }
        
        for(int i = 0 ; i < operations.length ; i++){
            
            
            memo.put(operations[i][1] , memo.get(operations[i][0]));
            nums[memo.get(operations[i][0])] = operations[i][1];
        }
       
        
        
//         for(int i = 0 ; i < nums.length ; i++){
            
//             for(int j = 0 ; j <operations.length ; j++){
                
//                 if(nums[i] == operations[j][0]){
//                     nums[i]=operations[j][1];
//                 }
                
//             }
            
//         }
        
        
        
        
        return nums ;
        
        
    }
}