class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] ans= new int[arr.length];
        
        Map<Integer,Integer> map= new HashMap<>();
        int [] nums= new int[arr.length];
        nums=arr.clone();
        
        Arrays.sort(nums);
        
        int k=1;
        for(int i=0;i<nums.length;i++){
            
            
            if(map.containsKey(nums[i])){
                continue;
            }
            
            map.put(nums[i],k++);
            
        }
        
        int i=0;
        for(int num:arr){
            ans[i++]=map.get(num);
        }
        
        return ans;
        
    
        
    }
}