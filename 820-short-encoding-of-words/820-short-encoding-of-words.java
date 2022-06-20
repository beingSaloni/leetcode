class Solution {
    public int minimumLengthEncoding(String[] words) {
        
        Arrays.sort(words,(a,b) -> a.length()-b.length());
        
        String s = "";
        // int sum = 0;
        
        for(int i = words.length-1 ; i>=0 ; i--){
            
            String st = words[i]+"#" ; 
            if(s.contains(st)){
                
                continue;
            }
            s = s+ st;
            // sum++;
            
            
        }
        
        return s.length();
        
    }
}