class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.length() != t.length()){
            
            return false;
            
        }
        
        HashMap memo = new HashMap<Character,Character>();
        
        for(int i = 0 ; i < s.length() ; i++){
            
            if(memo.containsKey(s.charAt(i))){
                
                if(!memo.get(s.charAt(i)).equals(t.charAt(i))  ){
                    
                    return false;
                }
                
            }else if (memo.containsValue(t.charAt(i))){
                
                    return false;
                }else{
                
                
                memo.put(s.charAt(i) , t.charAt(i));
            }
            
        }
        
        return true;
        
    }
}