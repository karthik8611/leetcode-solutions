class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> sublist= new ArrayList<>();
            
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    sublist.add(1);
                }else{
                    int a=list.get(i-1).get(j-1);
                    int b=list.get(i-1).get(j);
                    sublist.add(a+b);
                }
            }
            list.add(sublist);
            
            
        }
        
        return list;
        
    }
}