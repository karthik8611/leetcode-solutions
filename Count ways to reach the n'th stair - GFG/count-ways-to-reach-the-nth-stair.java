//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int countWays(int n)
    {
        
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 2;
        
      int  n2=2;
      int n1=1;
      
      int total=0;
      
      for(int i=3;i<=n;i++){
          total=(n1+n2)% 1000000007;
          n1=n2;
          n2=total;
      }
      
      return total ;
      
    }
}

