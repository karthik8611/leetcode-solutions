class Solution {

    public int buyChoco(int[] prices, int money) {
        int ans = 0;

        boolean flag = false;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            
            for (int j = i+1; j < prices.length; j++) {
               int sum = prices[i] + prices[j];
                
                
                    min=Math.min(min,sum);
                
                
            }
        }

        if (min<=money) {
            ans = money-min;
        }else{
            ans=money;
        }
        
        return ans;
    }
}
