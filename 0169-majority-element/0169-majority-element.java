class Solution {

    public int majorityElement(int[] nums) {
        int k = 0;
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(nums[i])> n / 2) {
                k = nums[i];
            }
        }

        return k;
    }
}
