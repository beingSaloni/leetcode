class Solution {
    public int longestStrChain(String[] words) {
        
        if(words == null || words.length == 0) {
            return 0;
        }
	
        int ans = 0;
	
        // Sorting on the basis of length of words
        Arrays.sort(words, (a,b)-> a.length()-b.length());
        
        //  ["a","b","ba","bca","bda","bdca"]
        
        
	    HashMap<String, Integer> map = new HashMap(); 
        
        
        
        for(String st : words){
            
            
            map.put(st,1);
            
            //  bdca 1 
            
            for(int i = 0 ; i < st.length() ; i++){
                
                StringBuilder sb = new StringBuilder(st);
                // bdca
                
               String w = sb.deleteCharAt(i).toString();
                // dca
                // bca
                // bda
                // bdc
                
                if(map.containsKey(w) && map.get(w)+1 > map.get(st)){
                    
                    // st , 4--> bca (bca --> b , ba, bca)
                
                    
                    map.put(st, map.get(w)+1);     
                }
                ans = Math.max(ans, map.get(st));     
                
                
            }
            
        }
        
        
        return ans;
	    

        
        
        
    }
}