class Solution {
    public boolean checkValidString(String s) {
        
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<Integer>();
     
        
       
        
        
        for(int i = 0 ; i < s.length() ; i++){
            
            if((s.charAt(i) == '(')  ){
                
                stack.push(i);
              
            }else if(s.charAt(i) == ')') {
                
                if(stack.size() > 0){
                    stack.pop();
                }else{
                   
                        if(stack2.size() > 0){
                            stack2.pop();
                        }else{
                            return false ;
                            
                        
                
                
                
                }
               
            }}
            else  {
                    
                    stack2.push(i);
                }
        }
            
        
     
        
        
        
        
        while(stack.size() > 0 && stack2.size() > 0){
            
           
            if(stack.pop() > stack2.pop()){
                
                return false;
            }
         
           
            
           
        } 
        
        
        return stack.size()==0;
        
        
    }
}