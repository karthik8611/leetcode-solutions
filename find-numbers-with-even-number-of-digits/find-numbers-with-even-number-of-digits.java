class Solution {
    public int findNumbers(int[] nums) {
        
        int ans=0;
        
        for(int n:nums){
            if(getNoOfDigits(n)%2==0){
                ans++;
            }
        }
        
        return ans;
       
        
        
        }
      public int getNoOfDigits(int n){
        
        int count=1;
        
        while((n/=10)!=0){
            count++;
    }
        
        return count;
        
        
        
    }
    
    
   
        
   
 
  
}