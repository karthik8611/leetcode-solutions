class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> list  = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list,new ArrayList<>(),candidates,target,0);
        return list;
        
        
        
    }
    // for time AND  space complexity refer leetcode solution
    
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] can, int remain, int start){
        
        if(remain<0){
            return; 
        }
           
       else if(remain==0){
            list.add(new ArrayList<>(tempList));
        }else{
           for(int i=start;i<can.length;i++){
               if(i>start && can[i]==can[i-1])continue;
                 tempList.add(can[i]);
               backtrack(list,tempList,can,remain-can[i],i+1);
               tempList.remove(tempList.size()-1);
           }
       }
        
    }
}