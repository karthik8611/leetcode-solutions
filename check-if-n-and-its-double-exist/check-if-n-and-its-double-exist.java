class Solution {
    public boolean checkIfExist(int[] arr) {
        
        // brute force -->use two loops
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int k: arr){
            if(set.contains(2*k) ||  (k%2==0 && set.contains(k/2)))
              return true;
              set.add(k);
        } 
        
        return false;
        
        
    }
}