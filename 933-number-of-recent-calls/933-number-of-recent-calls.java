class RecentCounter {
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        
      queue.add(t);
      int size = queue.size();
        
     while(queue.peek() < t-3000){
         
         queue.poll();
         
     }
      
      return queue.size();  
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */