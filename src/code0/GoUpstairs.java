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


    public int countWays(int n){
        int array[] = new int[100];
        array[0] = 0;
        array[1] = 1;
        array[2] = 1;
        array[3] = 2;
        for(int i=4; i<=n; i++){
            array[i] = (array[i-1]+array[i-2])%1000000007;
        }
        return array[n];
    }

}
