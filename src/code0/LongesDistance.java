package code0;

/**
 * Created by Knight_JXNU on 2016/10/9.
 * http://www.nowcoder.com/practice/1f7675ae7a9e40e4bd04eb754b62fd00?tpId=49&tqId=29281&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class LongesDistance {
    public int getDis(int[] A, int n){
        return findMaxDiff(A, 0, n-1, 0);
    }

    public int findMaxDiff(int[] A, int left, int right, int max){
        if(left == right){
            return max;
        }else{
            // right 为下标的最大值
            for(int i=left; i<=right; i++){
                for(int j=i; j<=right; j++){
                    if(A[j]-A[i] > max){
                        max = A[j]-A[i];
                    }
                }
            }
            return (findMaxDiff(A, left+1, right, max));
        }
    }
}
