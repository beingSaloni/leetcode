class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character> stack = new Stack<Character>();
        
        
        
        stack.push(num.charAt(0));
        
        for(int i = 1 ; i < num.length() ; i++){
            
            Character temp = stack.peek();
            int stackChar = Character.getNumericValue(temp);
            
            int numChar = Character.getNumericValue(num.charAt(i));
            if(stackChar < numChar ){
                
                stack.push(num.charAt(i));
            }else{
                
                while(stackChar > numChar){
                if(k > 0 && !stack.empty()){
                stack.pop();
                    k--;
                }else{
                    break;
                }
                    if(!stack.empty()){
                   stackChar = Character.getNumericValue(stack.peek()); 
                    }  
                } 
                stack.push(num.charAt(i));
            }
            
        }
        
        while(k > 0){
            
            stack.pop();
            k--;
        }
        
        String ans = "";
        
        while(!stack.empty()){
            
            
            ans = stack.pop() + ans;
        }
        
        
        int i = 0;
      while(i < ans.length() && ans.charAt(i) == '0'){
          i++;
      }
        
        // System.out.println(i);
        
        ans = ans.substring(i) ;
        
        if(ans.equals("")){
            
            return "0";
        }
        
        
        return ans;
            
            
        
    }
}