class Solution {
    public int maximumLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        int maxi=0;
        
         if(map.containsKey(1)){
             if(map.get(1)%2==0){
                 maxi=map.get(1)-1;
             }else{
                 maxi=map.get(1);
                 
             }
         }
        
        
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            int count=0;
            
            // while(val<=1e9 && map.containsKey(val)>=2 && map.get(val)>=2 && val!=1)
            while(val <= 1e9 && map.containsKey(val) && map.get(val) >= 2 && val != 1){
                count+=2;
                val*=val;
            }
            if(map.containsKey(val)){
                count++;
            }else{
                count--;
            }
            
            maxi=Math.max(count,maxi);
        }
        
        return maxi;
    }
}