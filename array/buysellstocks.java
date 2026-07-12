public class buysellstocks {
    public static int buyandsell(int prices[]){
        int buyprice= Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<prices.length; i++){
            if(buyprice<prices[i]){
                int profit= prices[i]-buyprice;
                maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
    int prices[]={4,2,0,6,3,2,5};
    System.err.println(buyandsell(prices));
    }
}
