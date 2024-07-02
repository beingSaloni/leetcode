class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int[] arr = new int[1001];
        int[] arr2 = new int[1001];
        
        for(int i = 0 ; i < nums1.length ; i++){
            
            arr[nums1[i]]++ ;
            
        }
        
        for(int j = 0 ;j < nums2.length ; j++){
            
            arr2[nums2[j]]++;
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        
        for(int i = 0 ; i<= 1000 ; i++){
            
            if(arr[i] > 0 && 0 < arr2[i] ){
                int z = Math.min(arr[i], arr2[i]);
                while(z != 0){
                    // System.out.println("OO");
                list.add(i);
                    z--;
                    
                }
            }
            
        }
        int[] r = new int[list.size()];
            
        for(int i = 0 ; i < list.size() ;i++){
            
            r[i] = list.get(i);
        }
            return r ;
        
    }
}