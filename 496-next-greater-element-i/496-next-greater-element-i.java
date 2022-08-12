class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> memo = new HashMap<>();
        
        Stack<Integer> stack = new Stack<Integer>();
      for(int i = 0 ; i < nums2.length ; i++){
          
          while(stack.size() > 0 && stack.peek() < nums2[i]){
              
                  memo.put(stack.pop() , nums2[i]); 
             
              
              
              
          }
          stack.push(nums2[i]);
          
      }
        int[] ans = new int[nums1.length];
        
        for(int i = 0 ; i<nums1.length ; i++){
            
            if(memo.containsKey(nums1[i])){
                ans[i] = memo.get(nums1[i]);
            }else{
                ans[i] = -1 ;
            }
            
        }
        
        return ans;
        
    }
}