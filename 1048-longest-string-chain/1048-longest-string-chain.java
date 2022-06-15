class Solution {
    public int longestStrChain(String[] words) {
        
        if(words == null || words.length == 0) {
            return 0;
        }
	
        int ans = 0;
	
        Arrays.sort(words, (a,b)-> a.length()-b.length());
	    HashMap<String, Integer> map = new HashMap(); 
        
        
        
        for(String st : words){
            
            
            map.put(st,1);
            
            for(int i = 0 ; i < st.length() ; i++){
                
                StringBuilder sb = new StringBuilder(st);
                
               String w = sb.deleteCharAt(i).toString();
                
                if(map.containsKey(w) && map.get(w)+1 > map.get(st)){
                    
                    map.put(st, map.get(w)+1);     
                }
                ans = Math.max(ans, map.get(st));     
                
                
            }
            
        }
        
        
        return ans;
	    

        
        
        
    }
}