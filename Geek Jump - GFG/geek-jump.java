//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int N){
        
        int dp [] = new int[N];
        
         Arrays.fill(dp,-1);
         
         dp [0]=0;
         
         for(int idx=1;idx<arr.length;idx++){
             
             int jumpTwo =Integer.MAX_VALUE;
             int jumpOne=dp[idx-1]+Math.abs(arr[idx]-arr[idx-1]);
             
             if(idx>1){
                 jumpTwo=dp[idx-2]+Math.abs(arr[idx]-arr[idx-2]);
             }
             
             dp[idx]=Math.min(jumpOne,jumpTwo);
             
            
         }
         
         return dp[N-1];
         
        
    
        
    }
}