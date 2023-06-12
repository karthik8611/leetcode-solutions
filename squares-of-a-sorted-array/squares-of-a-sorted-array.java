class Solution {

    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int k = nums.length-1;
        
        int [] nums1=new int[nums.length];

        while (left <= right) {
            int ls = nums[left] * nums[left];
            int rs = nums[right] * nums[right];
            
            if(ls>rs){
                nums1[k]=ls;
                left++;
            }else{
                nums1[k]=rs;
                right--;
            }
            k--;
        }
        return nums1;
    }
}
