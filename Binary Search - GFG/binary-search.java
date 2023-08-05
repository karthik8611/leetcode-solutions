//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int arr[], int n, int k) {
       return bs(0,n-1,arr,k);
    }
    
    int bs(int low,int high, int [] arr,int k){
        if(low<=high){
            
            int mid=low+(high-low)/2;
            
            if(arr[mid]==k)return mid;
            
            if(arr[mid]>k){
                return bs(low,mid-1,arr,k);
            }
            
            return bs(mid+1,high,arr,k);
            
            
        }
        
        return -1;
    }
}