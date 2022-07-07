class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        
        return solve(s1,0,s2,0,s3,0, new HashMap<String,Integer>());
    }
    public static boolean solve(String s1,int i1, String s2, int i2,String s3 ,int i3 , HashMap memo){
        
        if(i3 == s3.length() && i1 == s1.length() && i2 == s2.length()){
            return true;
        }
        
        if(i1 > s1.length() && i2 > s2.length()){
            return false;
        }
        
        if(i3>=s3.length()){
           return false;
        }
        
        String st = i1 + " " + i2 + " " + i3 ;
        
        if(memo.containsKey(st)){
            
            return (boolean)memo.get(st);
        }
        
        
        
         boolean check1 = false;
         boolean check2 =false;
        
        if(i1 < s1.length() && s1.charAt(i1) == s3.charAt(i3)){
            // System.out.println(s1.charAt(i1));
           check1 = solve(s1,i1+1,s2,i2,s3,i3+1,memo);
        } 
        if(i2 < s2.length() && s2.charAt(i2) == s3.charAt(i3)){
             // System.out.println(s2.charAt(i2));
             check2 = solve(s1,i1,s2,i2+1,s3,i3+1,memo);
        }
        
        memo.put(st, check1 || check2);
            return (check1 || check2);
        
        
        
    }
    
    
    
}
