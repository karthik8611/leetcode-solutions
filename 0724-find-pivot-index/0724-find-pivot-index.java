class Solution {
    public int pivotIndex(int[] nums) {
         int n=nums.length;
        int[] prefix_start = new int[n];
        int[] prefix_end= new int[n];

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            prefix_start[i]=sum;
        }
          sum=0;

        for(int i=n-1;i>=0;i--){
            sum+=nums[i];
            prefix_end[i]=sum;
        }


        int ans=-1;
        for(int i=0;i<n;i++){


         if(prefix_start[i]==prefix_end[i]){
                ans=i;
                break;
            }
        }

        return ans;

        
    }
}