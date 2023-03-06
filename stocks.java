class stocks {
    public static int maxProfit(int[] prices) {
        int cp = Integer.MAX_VALUE;
        int MaxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if(cp < prices[i]){
                int Profit = prices[i] - cp;
                MaxProfit = Math.max(MaxProfit,Profit);
            }
            else
            cp=prices[i];
        }
        return MaxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}