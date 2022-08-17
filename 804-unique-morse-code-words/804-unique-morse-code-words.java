class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String arr[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."} ;
        
        HashSet ans = new HashSet<>();
        
        for(int i = 0 ; i < words.length ; i++){
            
            String curr = "";
            
            for(int j = 0 ; j < words[i].length() ; j++){
                
                curr = curr + arr[words[i].charAt(j) - 'a'] ;
            }
            
            ans.add(curr);
            
            
        }
        
        return ans.size();
        
    }
}