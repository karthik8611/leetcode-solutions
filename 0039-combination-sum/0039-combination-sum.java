class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      // we use backtracking for this problem  
        
        List<List<Integer>> ans= new ArrayList<>();
        
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
        
         }
    
    // for time and space complexity refer   leetcode notes
    
    // refer take you forward  article for better understanding
    
    public void findCombinations(int index, int [] arr, int target,List<List<Integer>> ans, List<Integer> ds){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(arr[index]<=target){  // pick
            
            ds.add(arr[index]);
            findCombinations(index,arr,target-arr[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        
        findCombinations(index+1,arr,target,ans,ds);// did not pick
    }
}