class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        printSub(0,nums,new ArrayList<>(),list);
        return list;
        
     // time complexiy   
      //TC: O(n * 2^n), as every element has two options-to pick or not pick and n bcz we are copying the list of size n in base case.
//SC: O(n * 2^n)  
        
    }
    public static void printSub(int i, int arr [], ArrayList<Integer> subset,List<List<Integer>> list){
        if(i==arr.length){
            list.add(new  ArrayList<>(subset));
            return;
        }
        
        subset.add(arr[i]);
        printSub(i+1,arr,subset,list);
        subset.remove(subset.size()-1);
        printSub(i+1,arr,subset,list);
    }
    
    
}