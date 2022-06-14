class Solution {
    public int minDistance(String word1, String word2) {
        
        return minDis(word1, word2 , 0 , 0 , word1.length() , word2.length(), new HashMap<String,Integer>());
    }
    
    private int minDis(String word1, String word2 , int i , int j , int wi , int wj , HashMap memo){
        
        if(i>=wi){
           
            return wj - j;
        }
        
        if(j >= wj){
            
            return wi- i ;
        }
        String s = i + " " + j ;
        if(memo.containsKey(s)){
                 
            return (int)memo.get(s);
        }
        
        if(word1.charAt(i) == word2.charAt(j)){
             int ans = minDis(word1, word2 , i+1, j+1, wi, wj,memo);
            memo.put(s ,ans);
            return ans ;
        }
        
        // int ins = 1 + minDis(word1, word2 , i , j+1 , wi , wj,memo);
        int d1 = 1 + minDis(word1,word2,i+1,j,wi,wj,memo);
        int d2 = 1 + minDis(word1,word2,i,j+1,wi,wj,memo);
        // int rep = 1 + minDis(word1, word2, i+1 , j+1 , wi, wj,memo);
        int f = Math.min(d1 , d2) ;
        memo.put(s,f);
        return f;
        
        
    }
    
    
}