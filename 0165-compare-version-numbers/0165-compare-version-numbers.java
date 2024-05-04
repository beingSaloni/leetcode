class Solution {
    public int compareVersion(String version1, String version2) {
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        
        String ss = "";
        
        int temp = -1;
        for(int i = 0 ; i < version1.length() ; i++){
            
            
            
            if(version1.charAt(i) == '.'){
                
                temp = Integer.valueOf(ss);
                ss ="";
                q1.add(temp);
                
            }else{
                
                ss = ss + version1.charAt(i);
                
            }
            
           
            
        }
        
        temp = Integer.valueOf(ss);
                ss ="";
                q1.add(temp);
        
         for(int i = 0 ; i < version2.length() ; i++){
            
            
            
            if(version2.charAt(i) == '.'){
                
                temp = Integer.valueOf(ss);
                ss ="";
                q2.add(temp);
                
            }else{
                
                ss = ss + version2.charAt(i);
                
            }
            
           
            
        }
        
        temp = Integer.valueOf(ss);
                ss ="";
                q2.add(temp);
        
        
        while(0 < q1.size() && 0 < q2.size()){
            
            
         
            int temp1 = q1.poll();
            
            int temp2 = q2.poll();
            
            // System.out.println(temp1 + "ok" + temp2);
            
//             while(temp1 == 0){
//                 i++;
//                 temp1 = Integer.valueOf(ver1[i]);
//             }
            
//             while(temp2 == 0){
//                 j++;
//                  temp2 = Integer.valueOf(ver2[j]);      
//             }
            
           
            if(temp1 > temp2){
                return 1;
            }
            
            if(temp1 < temp2){
                
                return -1;
            }
            
            
            
            
        }
        
        if(q2.size() != 0){
                
                while(q2.size() > 0){
                    
                    if(q2.poll() > 0){
                        return -1;
                    }
                }
                
            }
        
         if(q1.size() != 0){
                
                while(q1.size() > 0){
                    
                    if(q1.poll() > 0){
                        return 1;
                    }
                }
                
            }
        
        return 0;
        
    }
}