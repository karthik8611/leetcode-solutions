class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
      HashMap<Integer,Integer> map =new HashMap<>();
      
        for(int i=0;i<nums.length;i++){
              int ithvalue=nums[i];
            
            if(map.containsKey(ithvalue) && Math.abs(map.get(ithvalue)-i) <= k){
                return true;
                
            }else{
                map.put(ithvalue,i);
            }
           
        }
        return false;
}
}