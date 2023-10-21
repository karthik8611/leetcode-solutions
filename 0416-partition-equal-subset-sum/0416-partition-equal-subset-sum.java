class Solution {
    public boolean canPartition(int[] nums) {
        
        int n=nums.length;
        
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        
        int k=sum/2;
        
        
        int dp[][]= new int[n][k+1];
        
        
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        
        
        if(sum%2==1){
            return false;
        }
        else{
            
            return partition(n-1,k,nums,dp);
            
            
        }
        
    }
  
    
    public boolean partition(int index, int target, int[] nums, int [][] dp){
        if(target==0) return true;
        
        if(index==0)  return nums[index]==target;
        
        if(dp[index][target]!=-1){
            return dp[index][target]==0?false:true;
        }
        
        
        boolean notTaken=partition(index-1,target,nums, dp);
        
        boolean taken=false;
        
        if(nums[index]<=target){
            taken=partition(index-1,target-nums[index],nums,dp);
            
        }
        
         dp[index][target]=notTaken || taken ?1:0;
        
        return taken || notTaken;
         
    }
}