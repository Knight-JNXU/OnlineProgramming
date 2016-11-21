package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/11/21.
 * 左右最值最大差
 * http://www.nowcoder.com/practice/f5805cc389394cf69d89b29c0430ff27?tpId=49&tqId=29359&rp=5&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class MaxGap {

    @Test
    public void test(){
        System.out.println(findMaxGap(new int[]{2,7,3,1,1}, 5));
        System.out.println(findMaxGap(new int[]{28,75,38,44,66,1}, 6));
    }

    public int findMaxGap(int[] A, int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n-1; i++){
            if(Math.abs(leftMax(A, i)-rightMax(A, i)) > max){
                max = Math.abs(leftMax(A, i)-rightMax(A, i));
            }
        }
        return max;
    }
    private int leftMax(int A[], int k){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=k; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }
    private int rightMax(int A[], int k){
        int max = Integer.MIN_VALUE;
        for(int i=k+1; i<A.length; i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }

}
