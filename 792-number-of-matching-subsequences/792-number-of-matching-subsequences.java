class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        
        Set<String> validWords = new HashSet<>();
        Set<String> invalidWords = new HashSet<>();
        int count = 0;
        for(String word: words) {
            
            if(validWords.contains(word)) {
                count++;
            } else if(invalidWords.contains(word)) {
                
            } else {
                    if(isSubSequence(s, word)) {
                    count++;
                    validWords.add(word);
                } else {
                    invalidWords.add(word);
                }
            } 
                
        }
        return count;
    }
    
    private boolean isSubSequence(String source, String sub) {
        
        int i=0,j=0;
        
        while(i<source.length() && j<sub.length()) {
            
            if(source.charAt(i) == sub.charAt(j)) {
                i++;j++;
            } else {
                i++;
            }
        }
        
        return (j == sub.length());
    }
}