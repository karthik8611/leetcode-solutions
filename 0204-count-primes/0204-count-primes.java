class Solution {
    public int countPrimes(int n) {
        
 boolean [] primes= new boolean[n];
        
        
        int count=0;
        
        for(int i=2;i<n;i++){
            if(primes[i])continue;
            count++;
            
            for(int j=i;j<n;j+=i){
                primes[j]=true;
            }
        }
        
        return count;
    }
}