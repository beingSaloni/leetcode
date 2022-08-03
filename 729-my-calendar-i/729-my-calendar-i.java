class MyCalendar {
    List<int[]> li ;
    
    public MyCalendar() {
         li = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        
        for(int i = 0 ; i < li.size() ; i++){
            int[] arr = li.get(i) ;
            if(start >= arr[0] && end <= arr[1] ) // 45,90  // 55, 50
                return false ;
            
            if(end > arr[0] && end < arr[1] ) // 40,55  // 50,53
                return false ;
            
            if(start < arr[1] && end >= arr[1] ) // 15, 10 // 25, 20
                return false ;
        }
        li.add(new int[]{start , end} ) ; 
        return true ;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */