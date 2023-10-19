class Solution {
    public boolean backspaceCompare(String s, String t) {

        return sb(s).equals(sb(t));
    }
    
    private String sb(String s){
        
        StringBuilder  k= new StringBuilder();
        
        for(char c:s.toCharArray()){
            if(c!='#'){
                k.append(c);
            } else if(k.length()!=0){
                k.deleteCharAt(k.length()-1);
            }
        }
        
        return k.toString();
        
    }
}