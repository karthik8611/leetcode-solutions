class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        int numRows=rowIndex+1;
        
        ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();

        for(int i=0;i<numRows;i++){
             ArrayList<Integer> list = new ArrayList<>();
            
             for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list.add(1);
                }else{
                 int a= mainList.get(i-1).get(j-1);
                  int b= mainList.get(i-1).get(j);
                    list.add(a+b);
                    
                }
                
             }
            mainList.add(list);
}
        
        return mainList.get(rowIndex);
        
        
    }
}