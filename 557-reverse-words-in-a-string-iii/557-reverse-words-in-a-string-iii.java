class Solution {
    public String reverseWords(String s) {
        String copy ="";
        String word = "";
        for(int i = 0 ; i < s.length() ;i++){
            if(s.charAt(i)== ' '){
                copy = copy +  word + " ";
                word = "";
                continue;
            }
           
             word = s.charAt(i) + word;
           
            
        }
        copy = copy + word;
        return copy;
        
    }
}