class Solution {
    public int removeDuplicates(int[] nums) {
        
        int[] arr = new int[201];
        
        int count = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            
            arr[nums[i] + 100]++;
            
        }
        
        for(int i = 0 ; i < 201 ; i++){
            
            if(arr[i] != 0){
                nums[count] = i - 100;
                count++;
                
            }
        }
        
        return count ;
        
    }
}