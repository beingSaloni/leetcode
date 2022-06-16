class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int n = nums.length, score = 0, sum = 0, left = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int right = 0; right < n; right++){
            
            
            while(set.contains(nums[right])){
                sum -= nums[left];
                set.remove(nums[left++]);
                
            }
            
            sum += nums[right];
            score = Math.max(score, sum);
            set.add(nums[right]);
        }
        
        return score;
    }
}

// 5 9 3 9 
//

// 4 2 4 5 6 
// 4 2 -->
// 4   -->
// 4 2 4
// 4 2 4 5
// 4 2 4 5 6
// 2 4
// 2 -->
// 2 4 5  __.
// 2 4 5 6
// 4 5 
// 4 
// 4 5 6
// 5 6
// 5
// 6