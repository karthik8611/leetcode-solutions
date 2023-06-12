class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        int maxcount = 0;
        int count = 0;

        while (i <= j) {
            if (nums[i] != 0) {
                count++;
            } else {
                count = 0;
            }

            maxcount = Math.max(count, maxcount);
            i++;
        }
        return maxcount;
    }
}
