class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        // -4,-1 , -1 , 0 , 1 , 2
        // -4 , -1 , -1 , 0 , 1, 2
        HashMap<Integer, Integer> memo = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            
            memo.put(nums[i] , i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            
            if(i!=0 && nums[i-1] == nums[i])
                continue;
            
            for(int j = i +1 ; j < nums.length ; j++){
                
                 if(j!= i+1 && nums[j-1] == nums[j])
                     continue;
                int sum = 0-nums[i]-nums[j];
                
                if(memo.containsKey(sum) && memo.get(sum) > i &&  memo.get(sum) > j  ){
                
                 List<Integer> curr = new ArrayList<>();
                  curr.add(nums[i]);
                    curr.add(nums[j]);
                    curr.add(sum);
                    ans.add(curr);
                    
                }
                
                
                
                
               
            }
        }
        
        return ans;
    }
}