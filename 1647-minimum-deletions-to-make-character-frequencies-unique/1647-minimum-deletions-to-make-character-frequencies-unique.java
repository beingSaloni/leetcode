class Solution {
    public int minDeletions(String s) {
        
       int[] f = new int[26];
        
        // System.out.println('a' - 97);
        for(int i = 0 ; i<s.length() ; i++){
            
            f[s.charAt(i) - 97]++;
        }
        // 3 3 3 2 1 0
        
        Arrays.sort(f);
        int c = 0;
       
        Set<Integer> freqSet = new HashSet();
        for(int i = 25 ; i>= 0 ; i--){
            
            if(f[i] <= 0){
                break;
            }
            // decrease the frequency till it becomes unique
            while(f[i] != 0 && freqSet.contains(f[i])){
                f[i]--;
                c++;
            }
            
            // add the unique frequency 
            freqSet.add(f[i]);
            
            
        }
        
        return c;
    }
}