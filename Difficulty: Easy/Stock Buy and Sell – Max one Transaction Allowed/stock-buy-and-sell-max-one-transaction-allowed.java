class Solution {
    public int maxProfit(int[] prices) {
        // Code here
        /*
        int profit=0;
        int max=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    profit=prices[j]-prices[i];
                    
                    if(max<profit)
                        max=profit;
                }
            }
        }
        return max;
        */
        
        int min = prices[0];
        int maxProfit = 0;

        for(int i=1;i<prices.length;i++){
              if(prices[i] < min){
               min = prices[i];
       }else{
             maxProfit = Math.max(maxProfit, prices[i] - min);
    }
        }
     return maxProfit;
    }
}