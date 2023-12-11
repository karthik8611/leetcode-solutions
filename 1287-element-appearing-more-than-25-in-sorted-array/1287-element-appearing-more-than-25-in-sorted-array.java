class Solution {
    public int findSpecialInteger(int[] arr) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int n=arr.length;
        
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
            
            
        }
        int k=0;
        
        
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])>n/4)k=arr[i];
        }
        
        return k;
        
    }
}