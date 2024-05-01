class Solution {
    public String reversePrefix(String word, char ch) {
        
        String ans = "" ;
        
        boolean check = false;
        
        for(int i = 0 ; i < word.length() ; i++){
            
            if(!check){
                
                ans = word.charAt(i) + ans ;
            }else{
                
                ans = ans + word.charAt(i);
            }
            
            if(word.charAt(i) == ch){
                check = true;
            }
            
        }
        
        if(check){
            return ans;
        }
        
        return word;
    }
}