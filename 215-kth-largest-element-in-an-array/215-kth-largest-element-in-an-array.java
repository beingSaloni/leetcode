class Solution {
    public int findKthLargest(int[] nums, int k) {
     
        
        
        
        // n longn
        
        // n logk
        
         PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        
        for(int i = 0 ; i<nums.length ; i++){
            
            pq.add(nums[i]);
        }
        
        while(k-- > 1){
            
            pq.poll();
        }
        
        
        return pq.poll();
        
    }
}