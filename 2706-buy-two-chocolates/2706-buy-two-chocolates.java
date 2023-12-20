class Solution {
    public int buyChoco(int[] prices, int money) {
        
        int smallest=Integer.MAX_VALUE,secondSmallest=Integer.MAX_VALUE;
        
        for(int i=0;i<prices.length;i++){
            if(prices[i]<smallest){
                secondSmallest=smallest;
                smallest=prices[i];
            }else if(prices[i]<secondSmallest){
                secondSmallest=prices[i];
                
            }
        }
        
        int minCost=smallest+secondSmallest;
            
            if(minCost<=money){
                return money-minCost;
            }
        return money;
            
        
    }
}