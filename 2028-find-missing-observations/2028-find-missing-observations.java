class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        
        int sum=0;
        for(int roll:rolls){
            sum+=roll;
        }
        
        
        int remainingSum=mean*(n+rolls.length)-sum;
        
        if(remainingSum>6*n || remainingSum<n){
            return new int[0];
            
        }
        
        int distributeMean=remainingSum/n;
        int mod=remainingSum%n;
        
        int [] remainEle= new int[n];
        Arrays.fill(remainEle,distributeMean);
        
        for(int i=0;i<mod;i++){
            remainEle[i]++;
        }
        
        return remainEle;
        
    }
}