class Solution {

    public int trap(int[] height) {
        int n = height.length;
        int[] lmax = new int[n];
        lmax[0] = 0;

        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], height[i - 1]);
        }
        
        int rmax[] = new int[n];
        
        rmax[n-1]=0;
        
        for(int i=n-2;i>=1;i--){
            rmax[i]=Math.max(rmax[i+1],height[i+1]);
        }
        
        
        
        int tw=0;
        
        for(int i=0;i<n;i++){
            int lh=Math.min(lmax[i],rmax[i]);
            
            int hw=lh-height[i];
            if(hw>0){
                tw+=hw*1;
            }
        }
        
        return tw;
    }
}
