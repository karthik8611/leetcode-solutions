class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
   
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>>  set= new HashSet<>();
          
            

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
            }else if(sum<0){
                left++;
            }else{
                right--;
            }
        }
        }
        
        result.addAll(set);
        
        
        return result;
        
    }
}


 // int target = 0;
 //        Arrays.sort(nums);
 //        Set<List<Integer>> s = new HashSet<>();
 //        List<List<Integer>> output = new ArrayList<>();
 //        for (int i = 0; i < nums.length; i++){
 //            int j = i + 1;
 //            int k = nums.length - 1;
 //            while (j < k) {
 //                int sum = nums[i] + nums[j] + nums[k];
 //                if (sum == target) {
 //                    s.add(Arrays.asList(nums[i], nums[j], nums[k]));
 //                    j++;
 //                    k--;
 //                } else if (sum < target) {
 //                    j++;
 //                } else {
 //                    k--;
 //                }
 //            }
 //        }
 //        output.addAll(s);
 //        return output;