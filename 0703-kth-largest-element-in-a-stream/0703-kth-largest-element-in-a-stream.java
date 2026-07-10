class KthLargest {

    int k ;

    PriorityQueue<Integer> q;

    public KthLargest(int k, int[] nums) {

        this.k = k ;

        q= new PriorityQueue<Integer>();

        for(int i : nums){
            add(i);
        }

        
    }
    
    public int add(int val) {

        if(q.size() < k || q.peek() < val){
            q.add(val);

            if(q.size() > k){

                q.remove();
            }
        }

        return q.peek();

       


        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */