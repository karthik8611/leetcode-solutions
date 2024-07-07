class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        
        int[] passengers_board= new int[1001];
        int[] passengers_drop= new int[1001];
        
         int n=trips.length;
        
        for(int i=0;i<n;i++){
            int count_of_passengers=trips[i][0];
            int start_point=trips[i][1];
            int end_point=trips[i][2];
            
            passengers_board[start_point]+=count_of_passengers;
            passengers_drop[end_point]+=count_of_passengers;
            
            
        }
         int total=0;
        for(int i=0;i<1001;i++){
             total +=passengers_board[i] - passengers_drop[i];
            if(total>capacity){
                return false;
            }
        }
        return true;
    }
};