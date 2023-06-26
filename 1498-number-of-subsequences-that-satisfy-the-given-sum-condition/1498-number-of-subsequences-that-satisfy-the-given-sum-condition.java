class Solution {
    public int numSubseq(int[] nums, int target) {
        
        Arrays.sort(nums);
        int n=nums.length;
        int mod=1_000_000_007;
    
        int result =0, left=0,right=n-1;
        int[] pow= new int [n];
        pow[0]=1;
        
        for(int i=1;i<n;i++){
            pow[i]=(pow[i-1]*2)%mod;
        }
        
        while(left<=right){
            if(nums[left]+nums[right]<=target){
                result+=pow[right-left];
                result%=mod;
                left++;
            }else{
                right--;
            }
        }
        return result;
        
        //time complexity nlogn and space o(n) for storing powers //refer discussion and leetcode solution for better understanding
        
    }
}