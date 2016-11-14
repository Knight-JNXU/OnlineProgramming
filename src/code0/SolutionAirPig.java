package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/11/14.
 * 风口的猪
 * http://www.nowcoder.com/practice/9370d298b8894f48b523931d40a9a4aa?tpId=49&tqId=29233&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class SolutionAirPig {

    @Test
    public void test(){
        System.out.println(calculateMax(new int[]{3, 8, 5, 1, 7, 8}));
    }

    /**
     * 计算你能获得的最大收益
     *
     * @param prices Prices[i]即第i天的股价
     * @return 整型
     */
    private static List<Integer> profits = new ArrayList<>();
    public int calculateMax(int[] prices) {
        calculate(prices);
        Collections.sort(profits);
        int result = profits.get(profits.size()-1);
        if(result < 0){
            return 0;
        }else{
            return result;
        }
    }


    public void calculate(int[] prices){
        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++){
                int temp = getProfit(prices, i, j);
                if(temp > 0){
                    profits.add(temp);
                    if(j<prices.length-2){
                        for(int m=j+1; m<prices.length-1; m++){
                            for(int n=m+1; n<prices.length; n++){
                                profits.add(temp+getProfit(prices, m, n));
                            }
                        }
                    }
                }

            }
        }
    }
    public int getProfit(int[] prices, int in, int out){
        return prices[out]-prices[in];
    }
}
