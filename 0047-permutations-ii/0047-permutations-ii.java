class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> mainlist = new ArrayList<>();
        boolean[] used= new boolean[nums.length];
        backtrack(mainlist,new ArrayList<>(),used,nums);
        return mainlist;
        
        
    }
    
    public  void backtrack(List<List<Integer>> list,List<Integer> temp,boolean[] used,int[] nums){
        if(temp.size()==nums.length && !list.contains(temp)){
            list.add(new ArrayList<>(temp));
            return;
        }else{
            for(int i=0;i<nums.length;i++){
                
                if(used[i])continue;
                used[i]=true;
                temp.add(nums[i]);
                backtrack(list,temp,used, nums);
                used[i]=false;
                temp.remove(temp.size()-1);
            }
        }
    }
}