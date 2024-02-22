class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,new ArrayList<>(),nums);
        return list;
        
    }
    
    public void backtrack(List<List<Integer>> list,List<Integer> tempList,int[] arr){
        if(tempList.size()==arr.length){
            list.add(new ArrayList<>(tempList));
            return;
        }else{
            for(int i=0;i<arr.length;i++){
               if (tempList.contains(arr[i])) continue;
                tempList.add(arr[i]);
                backtrack(list,tempList, arr);
                tempList.remove(tempList.size()-1);
                                 
                                 
            }
        }
    }
}