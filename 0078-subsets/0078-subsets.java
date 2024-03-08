class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, 0,new ArrayList<>(),nums);
        return list;
        
    }
    
    public void backtrack(List<List<Integer>> list, int start, List<Integer> temp,int[] nums){
        
        list.add(new ArrayList<>(temp));
        
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(list,i+1,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
}