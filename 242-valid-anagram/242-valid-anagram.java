class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        
        if(arr.length != arr2.length){
            
            return false;
        }
        
        int[] count = new int[26] ;
        
      
        
        for(int ele : arr){
            
            
            count[ele -'a']++;
            
            
        }
        
        
        for(int ele : arr2){
            
            if(count[ele-'a'] == 0){
                
                return false;
            }
            
            
              count[ele -'a']--;
        }
        
        return true;
    }
}