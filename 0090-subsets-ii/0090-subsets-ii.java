class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
           List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,new ArrayList<>(),0,nums);
        return list;
    }
    
    public void backtrack(List<List<Integer>> list,List<Integer> temp,int start,int[] nums){
        
        if(list.contains(temp))return;
            
        
        
        list.add(new ArrayList<>(temp));
    
        
        
        for(int i=start;i<nums.length;i++){
    
        
        temp.add(nums[i]);
        backtrack(list,temp,i+1,nums);
        temp.remove(temp.size()-1);
        }
        
        
    }

}