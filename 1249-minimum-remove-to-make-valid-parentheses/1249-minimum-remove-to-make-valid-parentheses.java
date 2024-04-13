class Solution {
    public String minRemoveToMakeValid(String s) {
        
        char[] arrS = s.toCharArray();
        
        Stack stack = new Stack<Integer>();
        
        for(int i = 0 ; i < arrS.length ; i++){
            
            if(s.charAt(i) == '('){
                
                
                stack.push(i);
                
            } 
            
            if(s.charAt(i) == ')'){
                
                if(stack.isEmpty()){
                    arrS[i] = '1';
                }else{
                    stack.pop();
                }
                
            } 
            
            
            
        }
        
        while(stack.size() > 0){
            
            arrS[(int)stack.pop()] = '1';
        }
        s = "";
        for(int i = 0 ; i < arrS.length ; i++){
           
            if(arrS[i] != '1' ){
            s = s + arrS[i];
            }
        }
        
        return s;
    }
}