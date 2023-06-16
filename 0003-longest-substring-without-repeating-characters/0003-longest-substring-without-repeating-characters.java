class Solution {

    public int lengthOfLongestSubstring(String s) {
        // refer notes to given in leetcode;
        int max = 0;
        int n = s.length();
        int i = 0;
        int [] arr =new int[128];
        for (int j = 0; j < n; j++) {
            int c=s.charAt(j);
            arr[c]++;
            
            while(arr[c]>1){
                arr[s.charAt(i)]--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
        
    }
}
