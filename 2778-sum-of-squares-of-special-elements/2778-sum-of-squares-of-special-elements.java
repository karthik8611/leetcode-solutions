class Solution {
    public int sumOfSquares(int[] nums) {
        
        int k=0;
        int n= nums.length;
     
        
        for(int i=0;i<n;i++){
            if(n%(i+1)==0){
                k+=nums[i]*nums[i];
            }
        }
        return  k;
        
    }
}