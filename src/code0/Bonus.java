package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Knigh on 2016/10/17.
 * http://www.nowcoder.com/practice/72a99e28381a407991f2c96d8cb238ab?tpId=49&tqId=29305&rp=2&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class Bonus {

    @Test
    public void test(){
        System.out.println(getMost(new int[][]{{426,306,641,372,477,409},
                {223,172,327,586,363,553},{292,645,248,316,711,295},
                {127,192,495,208,547,175},{131,448,178,264,207,676},
                {655,407,309,358,246,714}}));
    }

    private List<Integer> gifts = new ArrayList<>();

    public int getMost(int[][] board) {
        getGift(0, 0, board, board[0][0]);
        Collections.sort(gifts);
        return gifts.get(gifts.size()-1);
    }

    public void getGift(int i, int j, int[][] board, int sum) {
        if(i==5 && j==5){
            gifts.add(sum);
        }else{
            if(i<5){
                if(j<5){
                    getGift(i+1, j, board, sum+board[i+1][j]);
                    getGift(i, j+1, board, sum+board[i][j+1]);
                }else{
                    if(j==5){
                        getGift(i+1, j, board, sum+board[i+1][j]);
                    }
                }
            }else{
                if(i==5){
                    if(j<5){
                        getGift(i, j+1, board, sum+board[i][j+1]);
                    }
                }
            }
        }
    }
}
