class Solution {
    public int findPeakElement(int[] nums) {
        
        int low=1;
        int n=nums.length;
        
        if(nums.length==1){
            return 0;
        }
     
        
        int high=n-2;
        
        
        if(nums[0]>nums[1]){
            return 0;
        }
        
        
        if(nums[n-1]>nums[n-2]){
            return n-1;
        }
        
        while(low<=high){
           
            int mid=low+(high-low)/2;
            
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }else if(nums[mid]<nums[mid-1]){
                high=mid-1;
            } else if (nums[mid]<nums[mid+1]){
                
                low =mid+1;
                
            }
                
            
                
        }
        
        return -1;

    }
}

// brute force
 //int k=0;
//         if(nums.length==2){
//             if(nums[0]>nums[1]){
//                 k=0;
//             }else{
//                 k=1;
//             }
//         }
            
    
        
//         //int max=Integer.MIN_VALUE;
//         for(int i=1;i<nums.length-1;i++){
//             if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
//                 k=i;
//             }else if(nums[i-1]<nums[i] && nums[i]<nums[i+1]){
//                 k=i+1;
//             }
//         }
        
//         return k;