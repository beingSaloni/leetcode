class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        // abc --> 123
        // deq --> 123
        // mee --> 122
        // aqq --> 122
        // dkd --> 121
        // ccc--> 111
        // abb --> 122
       
        String[] code = new String[words.length + 1];
        List<String> ans = new ArrayList<>();
        code[words.length] = "";
        solve(pattern, new HashMap<Character,Integer> (), 0 , code ,words.length, 0);
         // System.out.println(code[words.length]);
        for(int i = 0 ; i < words.length ; i++){
            code[i] = "";
        solve(words[i], new HashMap<Character,Integer>(), 0 , code , i , 0);
          
            // System.out.println(code[i]);
            if(code[i].equals(code[words.length]) ){
                
                ans.add(words[i]);
            }
            
        
    }
        
        return ans;
}
    
    private void solve(String  st , HashMap<Character,Integer> memo , int count , String[] code ,int i, int index ){
              
        if(index >= st.length()){
            
            return;
        }
        
        if(memo.containsKey(st.charAt(index))){
            
            code[i] = code[i] + (int)memo.get(st.charAt(index));
        }else{
            
            memo.put(st.charAt(index) , count) ;
            count++;
            code[i] = code[i] + (int)memo.get(st.charAt(index));
        }
        
        solve(st,memo,count,code , i, index+1);
        
    
    
    
    }





}