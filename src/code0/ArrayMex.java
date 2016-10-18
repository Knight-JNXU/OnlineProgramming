package code0;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Knigh on 2016/10/18.
 * http://www.nowcoder.com/practice/9e7a6bcdbce74feb8013d252d76855da?tpId=49&tqId=29365&rp=5&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class ArrayMex {

    @Test
    public void test(){
        System.out.println(findArrayMex(new int[]{-1,2,3,4}, 4));
    }

    public int findArrayMex(int[] A, int n) {
        int max = 501;
        StringBuffer sb = new StringBuffer();
        for(int i : A){
            sb.append("|"+i+"|");
        }
        String str = sb.toString();
        for(int i=1; i<max; i++){
            if(!str.contains("|"+i+"|")){
                return i;
            }
        }
        return -1;
    }
}
