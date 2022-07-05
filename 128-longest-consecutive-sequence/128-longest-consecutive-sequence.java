class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        Arrays.sort(nums);
        int i = 0;
        int max = 0;
        int cm = 0;
        while(nums.length-1>i){
            
            // if(nums[i] +1 == nums[i+1]){
            //     i++;
            //     continue;
            // }
            
            if(nums[i] + 1 == nums[i+1]){
                cm++;
            }else if(nums[i] == nums[i+1]){
                
            }else{
                cm=0;
                System.out.println(nums[i] + 1+ " " + nums[i+1]);
            }
            
            if(cm>max){
                max= cm;
            }
            
            i++;
        }
        if(cm>max){
                max= cm;
            }
        return max+1;
    }
}