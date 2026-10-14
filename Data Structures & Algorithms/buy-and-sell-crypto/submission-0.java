class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0, minBuy = prices[0];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < prices.length; i++){
            if(minBuy > prices[i]){
                minBuy = prices[i];
            }

            if(maxProf < prices[i] - minBuy){
                maxProf = prices[i] - minBuy;
            }
        }
        return maxProf;
    }
}
