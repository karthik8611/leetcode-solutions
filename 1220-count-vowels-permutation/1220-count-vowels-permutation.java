class Solution {
    public int countVowelPermutation(int n) {
        
        long mod =1000_000_007;
        
        long [][] dp = new long[n+1][5];
        
        
        for(int i=0;i<5;i++){
            
            dp[1][i]=1;
            
        }
        
        /*
        a--->0,b-->1,c-->2,d-->3,e-->4    
        */
        
        
        for(int i=2;i<=n;i++){
            dp[i][0]=(dp[i-1][1]+dp[i-1][2]+dp[i-1][4])%mod;// a-->
            dp[i][1]=(dp[i-1][0]+dp[i-1][2])%mod;
            dp[i][2]=(dp[i-1][1]+dp[i-1][3])%mod;
            dp[i][3]=(dp[i-1][2])%mod;
            dp[i][4]=(dp[i-1][2]+dp[i-1][3])%mod;
            

        }
        
        long count=0;
        
        
        for(long k:dp[n]){
             count+=k;
            
            count%=mod;
        }
        
        return (int) count;
        
    }
}