class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int[] alp = new int[26];
        
        for(int i =0 ; i < allowed.length() ; i++){
            
            alp[allowed.charAt(i) - 'a']++;
            
        }
        
        int c = 0;
        
        for(int i = 0 ; i< words.length ; i++){
            
            for(int j = 0 ; j < words[i].length() ; j++){
                
                if(alp[words[i].charAt(j) -'a'] == 0 ){
                    
                    break;
                }
                if(j==words[i].length()-1){
                    c++;
                }
            }
          
            
        }
        
        return c;
        
        
        
        
    }
}