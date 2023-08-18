class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
         List<List<Integer>> list = new ArrayList<>();
          Set<List<Integer>> set = new HashSet<>();
        
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                } else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        
        list.addAll(set);
        return list;
        
    }
}