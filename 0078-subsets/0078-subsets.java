class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        backtrack(list,new ArrayList<>(),0,nums);
        return list;
    }
public void backtrack(List<List<Integer>> list,List<Integer> temp,int idx,int[] nums){
        
        list.add(new ArrayList<>(temp));
        
        for(int i=idx;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(list,temp,i+1,nums);
            temp.remove(temp.size()-1);
            
            
        }
        
        
    }
}