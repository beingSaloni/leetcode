class Solution {
    public List<List<String>> partition(String s) {
        
    
         List<List<String>> outer = new  ArrayList<List<String>>();
        
        List<String> inner = new  ArrayList<String>();
        
        part(s , outer , inner , 0 );
        
        return outer ;
        
    }
    
    public static void part(String s ,  List<List<String>> outer,  List<String> inner , int start ){
        
        if(start>= s.length()){
            
            outer.add(new ArrayList<String>(inner));
            
            return;
        }
        
        
        
       for(int i = start ; i < s.length(); i++ ){
           
           String st = s.substring(start,i+1);
         
           if(isPalindrome(st)){
                 inner.add(st);
               // System.out.println(st);
               part(s,outer,inner,i+1);
                inner.remove(inner.size()-1);
           }
          
       }
        
        
    }
    
    public static boolean isPalindrome(String st ){
        int start = 0;
        int end = st.length()-1;
       while(start < end){
           
           if(st.charAt(start) != st.charAt(end)){
               
               return false;
           }
           start++;
           end--;
       }
        // System.out.println(st);
        return true;
        
        
        
    }
    
}