class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int left=1;
        int right=1000000000;
        
        while(left<=right){
            int mid= left+(right-left)/2;
            
            if(eat(piles,mid,h))
                right=mid-1;
            else
                left=mid+1;
        }
        
        return left;
        
   // hi malik solution for better understanding;     
     // we binary search algorith here   
        
    }
    
    public boolean eat(int [] piles,int k,int h){
         long hours=0;
        
        for(int pile:piles){
            int div=pile/k;
            hours+=div;
            
            if(pile%k!=0){
                hours++;
            }
        }
        
        return hours<=h;
    }
        
}