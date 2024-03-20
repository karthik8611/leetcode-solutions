class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        Deque<Integer> dq = new ArrayDeque<>();
        int n=nums.length;
        
        int[] windows = new int[n-k+1];
        int idx=0;
        for(int i=0;i<n;i++){
            int ele=nums[i];
            
            while(dq.size()>0 && ele>nums[dq.getLast()]){
                dq.removeLast();
            }
            
            dq.addLast(i);
            
            int start_idx=i-k+1;
            
            while(dq.size()>0 && dq.getFirst()<start_idx){
                dq.removeFirst();
            }
            
            if(i>=k-1){
                windows[idx++]=nums[dq.getFirst()];
            }
            
            
        }
        
        return windows;
        
    }
}