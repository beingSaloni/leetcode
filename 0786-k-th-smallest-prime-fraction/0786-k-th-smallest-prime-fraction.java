class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
         PriorityQueue<Float> pq = new PriorityQueue<>();
        
        HashMap<Float , int[] > memo = new HashMap<>();
        
        
        
        for(int i = 0 ; i < arr.length ; i++){
            
            for(int j = i+ 1; j < arr.length ; j++){
                
                pq.add((float)arr[i]/arr[j]);
                int[] ans = {arr[i] , arr[j]};
                memo.put((float)arr[i]/arr[j] , ans);
                
            }
            
            
            
        }
        
        while(k-- > 1){
            
         pq.poll();
        }
        
        return memo.get(pq.poll());
        
    }
}