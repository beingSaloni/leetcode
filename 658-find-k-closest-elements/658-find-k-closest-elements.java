class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        int n = arr.length;
        
        int start = 0 ;
        
        int end = n-1;
        
        int pivot = -1 ;
        
        while(start <= end){
            
            int mid = start + (end-start)/2 ;
            
            if(arr[mid] <= x){
                pivot = mid ;
                start = mid + 1;
            }else{
                  
                end = mid-1;
                
            
            }
            
        }
        
        int left = (pivot-k < 0) ? 0 : pivot - k ;
        int right = (pivot + k >= n) ? n-1 : pivot + k;
        
        while(right-left + 1 > k){
            
            if(Math.abs(arr[left]-x) > Math.abs(arr[right]- x))
                left +=1;
            else
                right -=1;
            
            }
      List<Integer> answer = new  ArrayList<>();
        
        for(int i = left ; i <= right ; i++){
            
            answer.add(arr[i]);
        }
        
        
        return answer ;
        
        
    }
}