package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/11/16.
 * 股票交易日
 * http://www.nowcoder.com/practice/3e8c66829a7949d887334edaa5952c28?tpId=49&tqId=29317&rp=3&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class Stock {

    @Test
    public void test(){
        System.out.println(maxProfit(new int[]{10,22,5,75,65,80}, 6));
    }

    public int maxProfit(int[] prices, int n) {
        int firstBuy = Integer.MIN_VALUE;
        int firstSell = Integer.MIN_VALUE;
        int secondBuy = Integer.MIN_VALUE;
        int secondSell = Integer.MIN_VALUE;
        for(int i=0; i<prices.length; i++){
            firstBuy = Math.max(firstBuy, -prices[i]);
            firstSell = Math.max(firstSell, prices[i]+firstBuy);
            secondBuy = Math.max(secondBuy, firstSell-prices[i]);
            secondSell = Math.max(secondSell, prices[i]+secondBuy);
        }
        return secondSell;
    }
}
