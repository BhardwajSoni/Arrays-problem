public class BuyAnSellStock {
    public static int stockprofit(int price[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        //price[i] is today selling price
        //buyPrice aaj tak ka min price 
        for(int i=0;i<price.length;i++){
            if(buyPrice < price[i]){
                int Profit=price[i]-buyPrice;//sellingPrice-buyprice
                if(Profit>maxProfit){
                    maxProfit=Profit;
                }
            }
            else{
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,6,5,3,2,1};
        System.out.println(stockprofit(price));
    }
    
}
