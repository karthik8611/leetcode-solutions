class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> list = new ArrayList<>();
        backtrack(s,list,new ArrayList<>());
        return list;
        
        
        
    }
    
    public void backtrack(String s, List<List<String>> list, List<String> tempList ){
        // base case;
         if(s==null || s.length()==0){
             list.add(new ArrayList<>(tempList));
             return;
         }
        
        for(int i=1;i<=s.length();i++){
            String k=s.substring(0,i);
            
            if(!isPalindrome(k)) continue;
            tempList.add(k);
            backtrack(s.substring(i,s.length()),list,tempList);
            tempList.remove(tempList.size()-1);
        }
        
        
        
        
    }
    
    public boolean isPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    
    
}