package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/10/18.
 * http://www.nowcoder.com/practice/376ede61d9654bc09dd7d9fa9a4b0bcd?tpId=49&tqId=29366&rp=5&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class MaxDivision {

    @Test
    public void test(){
        System.out.println(findMaxDivision(new int[]{9,3,1,10}, 4));
    }

    public int findMaxDivision(int[] A, int n) {
        Arrays.sort(A);
        int max = A[1]-A[0];
        for(int i=1; i<n-1; i++){
            if(A[i+1]-A[i] > max){
                max = A[i+1]-A[i];
            }
        }
        return max;
    }

}
