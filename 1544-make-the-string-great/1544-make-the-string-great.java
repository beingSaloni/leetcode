class Solution {
    public String makeGood(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
        stack.push(s.charAt(0));

        for(int i = 1 ; i < s.length() ; i++){
            
            if(stack.size() == 0){
                
                stack.push(s.charAt(i));
                continue;
            }
            
            int stackChar = stack.peek() - '0' ;
            
            int currChar = s.charAt(i) - '0' ;            
            
          if((currChar == stackChar + 32) || (stackChar -32 == currChar)){
              
              stack.pop();
          }else{
              
              stack.push(s.charAt(i));
          }

            

           


        }
        
        s = "";
        
        while(!stack.empty()){
            
            s = stack.pop() + s;
        }
        
        return s;
        
    }
}