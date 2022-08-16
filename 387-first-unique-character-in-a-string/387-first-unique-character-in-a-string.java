class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<String,Integer> memo = new HashMap<>();
        
        for( int i = 0 ; i< s.length() ; i++){
          
            String st = s.charAt(i)+"" ;
            
            if(memo.containsKey(st)){
                
                memo.put(st , memo.get(st) + 1);
                
            }else{
            
           memo.put(st, 1);
            }
            
            // System.out.println(j);
        }
        
        for(int i = 0 ; i<s.length() ; i++){
            
             String st = s.charAt(i)+"" ;
            if(memo.get(st) == 1){
                
                return i;
            }
            
        }
        
        
        
        
        return -1;
    }
}