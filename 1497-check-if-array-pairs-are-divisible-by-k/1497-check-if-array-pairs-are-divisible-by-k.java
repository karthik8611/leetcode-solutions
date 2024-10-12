class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        HashMap<Integer,Integer> remCounts= new HashMap<>();
        
        for(int num:arr){
            int rem=(num%k+k)%k;
            remCounts.put(rem,remCounts.getOrDefault(rem,0)+1); 
        }
        
        
        for(int num:arr){
            int rem=(num%k+k)%k;
            
            if(rem==0){
              if(remCounts.get(rem)%2==1) return false;
            }else if(!Objects.equals(remCounts.get(rem),remCounts.get(k-rem))) return false;
            }
        
                   
                   return true;
    
        
        
    }
}