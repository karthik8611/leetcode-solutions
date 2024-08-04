class Solution {

    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;

        int si = 0;
        int ei = nums.length - 1;
        
        if(nums[si]<=nums[ei]){
            return nums[si];
        }

        while (si <= ei) {
            int mid = (si + ei) / 2;

            if (mid>0 && nums[mid] < nums[mid-1]) {
            // mid is pivot
                 return nums[mid];
            } else if(nums[mid+1]<nums[mid]){
               return nums[mid+1];
            }
            
            else  if(nums[si]<=nums[mid]){
                
                // left portion is sorted
                
                si=mid+1;
    
            }else {
                //right portion is sorted
                ei=mid-1;
            }
        }

        return -1;
    }
}
