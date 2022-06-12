class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int n = nums.length, score = 0, sum = 0, left = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int right = 0; right < n;){
            
            if(set.contains(nums[right])){
                sum -= nums[left];
                set.remove(nums[left++]);
                continue;
            }
            
            sum += nums[right];
            score = Math.max(score, sum);
            set.add(nums[right++]);
        }
        
        return score;
    }
}