package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/10/9.
 * http://www.nowcoder.com/practice/4b24ebad2ffd4f679320fd464b2036a6?tpId=49&tqId=29321&rp=3&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class GoUpstairs {

    @Test
    public void test(){
        System.out.println(countWays(3));
    }

    static int sum = 0;

    public int countWays(int n){
        findWays(n);
        return sum;
    }

    public void findWays(int n){
        if(n==3 || n==2){
            sum += 2;
            return;
        }
        if(n-1 >= 0){
            sum++;
            findWays(n-1);
        }
        if(n-2 >= 0){
            sum++;
            findWays(n-2);
        }
    }
}
