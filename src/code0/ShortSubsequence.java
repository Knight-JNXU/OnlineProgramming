package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/10/17.
 * http://www.nowcoder.com/practice/a6926700bd424820bd73777f1cb2ef60?tpId=49&tqId=29358&rp=5&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class ShortSubsequence {

    @Test
    public void test(){
        System.out.println(findShortest(new int[]{1,5,3,4,2,6,7}, 7));
    }

    public int findShortest(int[] A, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i : A){
            list.add(i);
        }
        Collections.sort(list);
        int min=0, max=0;
        for(int i=0; i<n; i++){
            if(!list.get(i).equals(A[i])){
                min = i;
                break;
            }
        }
        for(int i=n-1; i>=0; i--){
            if(!list.get(i).equals(A[i])){
                max = i;
                break;
            }
        }
        if((max-min)==0){
            return 0;
        }else{
            return (max-min+1);
        }
    }
}
