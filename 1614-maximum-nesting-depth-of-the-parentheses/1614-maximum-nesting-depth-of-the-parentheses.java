class Solution {
    public int maxDepth(String s) {
        
         Stack stack1 = new Stack();
        
        int ans = 0 ;
        
        for(int i = 0 ; i < s.length() ; i++){
            
            if(s.charAt(i) == '('){
                stack1.push('(');
            }
            
            if(s.charAt(i) == ')' && stack1.size() > 0){
                stack1.pop();
            }
            
            ans = Math.max(ans, stack1.size());
            
        }
        
        return ans;
        
    }
}