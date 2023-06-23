class Solution {
    public int findKthPositive(int[] arr, int k) {
        
       int left=0;
        
        int right=arr.length-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
            
          if(arr[mid]-mid<=k){
              left=mid+1;
          }else{
              right=mid-1;
          }
            
            
        }
        return left+k;
        
        //time complexity:o(logn) sc: o(1) binarysearch
        
    }
}