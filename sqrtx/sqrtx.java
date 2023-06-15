class Solution {
    public int mySqrt(int x) {
   
        if(x==0)return 0;
        
    int start=1,end=x,ans=0;
        
        while(start <= end){
            int mid=start+(end-start)/2;
            
            if(mid==x/mid) {
                 return mid;
            }
               
            else if(mid>x/mid) {
                end=mid-1;
            } 
            else{
                
                start=mid+1;
                ans=mid;
                
            }//ans is updated during the binary search to keep track of the largest integer mid whose square is less than or equal to x. It acts as a temporary storage to hold the current valid square root candidate until the binary search process completes.
        }
        return ans;
        
    }
}
