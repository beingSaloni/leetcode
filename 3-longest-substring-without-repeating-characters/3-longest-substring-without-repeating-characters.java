class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int max = 0 ;
        
         int cm = 0;
        
        for(int i = 0 ; i<s.length() ; i++){
            
            ArrayList<String> list = new ArrayList<>();
           
               cm = 0;
            for(int j = i ; j<s.length() ; j++){
                
                String st = "" + s.charAt(j);
                
                if(!list.contains(st)){
                    list.add(st);
                    
                    cm++;
                     if(cm > max){
                max =cm ;
            }
                    // System.out.println(st + "" +cm);
                }else{
                 
                    break;
                }
                
                
            }
            
           
            
        }
        
        return max;
        
    }
}