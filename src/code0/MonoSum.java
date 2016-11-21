package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/11/21.
 * 数组单调和
 * http://www.nowcoder.com/practice/8397609ba7054da382c4599d42e494f3?tpId=49&tqId=29364&rp=5&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class MonoSum {

    @Test
    public void test(){
        System.out.println(calcMonoSum(new int[]{1,3,5,2,4,6},6));
    }

    public int calcMonoSum(int[] A, int n) {
        int sum = 0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<i; j++){
                if(A[j]<=A[i]){
                    sum+=A[j];
                }
            }
        }
        return sum;
    }
}
