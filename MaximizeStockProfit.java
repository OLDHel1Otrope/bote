public static int calculateMaxPossibleProfit(int prices[]){
        int buy=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(buy>prices[i])//if we are getting that product for cheaper then we are considering buying at that proce
            {
                buy=prices[i];
            }
            else if(prices[i]-buy > profit)//if the new profit is better than old profit then we take the new profit
            {
                profit=prices[i]-buy;
            }
        }

        return profit;

    }
