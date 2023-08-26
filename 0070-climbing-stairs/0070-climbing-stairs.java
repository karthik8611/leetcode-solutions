class Solution {
    public int climbStairs(int n) {
    if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        
        int Nminus2=1;
        int Nminus1=2;
        
        int total=0;
        
        for(int  i=3;i<=n;i++){
            
            total=Nminus2+Nminus1;
            Nminus2=Nminus1;
            Nminus1=total;
        }
        
        return total;
        
        
    }
}