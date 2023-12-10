class Solution {

    public List<Integer> getGoodIndices(int[][] variables, int target) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < variables.length; i++) {
            int[] row = variables[i];
            int a = row[0], b = row[1], c = row[2], d = row[3];
            
            int t=1;
            
            for(int j=0;j<b;j++){
                t=(t*a)%10;
            }
            int x=1;
            
             for(int j=0;j<c;j++){
                x=(t*x)%d;
            }
            
            if(target==x){
                list.add(i);
            }
            
            

           
        }
        return list;
    }
}
