class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        //   3 4 3 2 1 
        
        //   4 3 2 1
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = nums.length-1 ; i >=0 ; i--){
            
            stack.push(nums[i]);
        }
        
        for(int i = nums.length-1 ; i >= 0 ; i--){
            
            int temp = nums[i];
            
            while(stack.size() > 0 && stack.peek() <= temp){
                stack.pop();
            }
            
            if(stack.size() ==0){
                nums[i] = -1;
            }else{
                nums[i] = stack.peek();
            }
            stack.push(temp);
        }
        
        return nums ;
    }
}
