package ДЗ_21_02;
// я сделала 2 решения
// это первое
class Solution {
    public int maxProfit(int[] prices) {
        int min_price = 10001;
        int day_of_purchase = 0;
        int max_price = 0;
        for(int i = 0; i < prices.length; i++ ){
            if(prices[i] < min_price){
                min_price = prices[i];
                day_of_purchase = i;
            }
        }
        for(int k = day_of_purchase; k < prices.length; k++ ){
            if(prices[k] > max_price){
                max_price = prices[k];
            }
        }
        int profit = max_price - min_price;
        return profit;
    }
}

// второе
class Solution {
    public int maxProfit(int[] prices) {
        int min_price = 10001;
        int today_profit = 0;
        int max_profit = 0;
        for(int i = 0; i < prices.length; i++ ){
            if(prices[i] < min_price){
                min_price = prices[i];
            }
            today_profit = prices[i] - min_price;
            if(today_profit > max_profit){
                max_profit = today_profit;
            }
        }
        return max_profit;
    }
}
