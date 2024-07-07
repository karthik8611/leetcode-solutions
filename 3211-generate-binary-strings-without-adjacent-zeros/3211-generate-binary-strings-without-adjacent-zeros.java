class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        
        generateValidStrings(list,"",n);
        return list;
    }
    
    
    public void generateValidStrings(List<String> list,String current,int n){
        
        if(current.length()==n){
            list.add(current);
            return;
        }
        
        
        if(current.length()==0 || current.charAt(current.length()-1)=='1'){
            generateValidStrings(list,current+'0',n);
            generateValidStrings(list,current+'1',n);
        }else{
            generateValidStrings(list,current+'1',n);
        }
    }
}