class Solution {

    public List<Integer> lexicalOrder(int n) {
        int current_num = 1;

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans.add(current_num);

            if (current_num *10<= n) {
                current_num=current_num*10;
            }else{
                
                while(current_num%10==9 || current_num>=n){
                    current_num=current_num/10;
                }
                current_num++;
            }
        }
        
        return ans;
    }
}
