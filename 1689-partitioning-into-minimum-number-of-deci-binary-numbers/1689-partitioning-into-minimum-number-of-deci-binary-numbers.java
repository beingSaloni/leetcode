class Solution {
    public int minPartitions(String n) {
        
        
        
        
        
         for(int i= 9 ; i > 0 ; i--){
           String s = i + "";
           if(n.contains(s)){
               return i;
           }
            
          
            
        }
        
        return 0;
        
    }
}