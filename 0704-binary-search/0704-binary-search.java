class Solution {
    public int search(int[] nums, int target) {
        
        int low=0;
        int high=nums.length-1;
        
        return binarySearch(nums,low, high,target);
    }
    
    
    public int binarySearch(int[] arr, int low, int high, int key){
        if(low>high) return -1;
        
        int mid=(low+high)/2;
        
        if(arr[mid]==key) {
            return mid;
        }else if(arr[mid]<key){
            low=mid+1;
     
        }else{
            high=mid-1;

        }
        
        return binarySearch(arr,low,high,key);
        
    
    }
}