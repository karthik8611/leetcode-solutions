class Solution {
    public int findKthLargest(int[] nums, int k) {
        
       // use leetcode solution for better unerstanding
    // in this  problem we are using min heap
        
        PriorityQueue<Integer>pq= new PriorityQueue<>();// this is min heap by default smallest elemest will at the front of the queue;
        for(int num:nums){
            pq.offer(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        
        // using max heap time complexity --> O(n+klogn)  o(n) -->initially we had array so we are building heap out of it--> for building heap +  klogn time for heapify process
        
       // using   min heap time complexity --> O(n+(n-k+1)logn(n-k+1))
        return pq.peek();
        
    }
}