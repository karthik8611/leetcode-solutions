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
            return binarySearch(arr,mid+1,high,key);
        }else{
            return binarySearch(arr,low, mid-1,key);
        }
    }
}