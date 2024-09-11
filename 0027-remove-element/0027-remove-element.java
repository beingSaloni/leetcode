class Solution {
    public int removeElement(int[] nums, int val) {
        
        int c = 0 ;
        Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i] == val ){
                 
                c++;
             nums[i] =   nums[nums.length-c] ;
            }
            
        }
        
         
        // System.out.println(c);
        return nums.length - c ;
        
    }
}