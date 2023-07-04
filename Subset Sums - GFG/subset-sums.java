//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
       
        
        ArrayList<Integer> list = new ArrayList<>();
        
        
        backtrack(list,arr,0,0);
         Collections.sort(list);
        return list;
        
    }
    
    private static  void  backtrack(List<Integer> list,List<Integer> temp, int index, int sum ){
        if(index==temp.size()){
             
        list.add(sum);
            return;
        }
        
    
    
        
       
       
        backtrack(list,temp,index+1,sum+temp.get(index));
        backtrack(list,temp,index+1,sum);
        
        
    }
    
}