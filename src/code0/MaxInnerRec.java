package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/11/18.
 * 直方图内最大矩形
 * http://www.nowcoder.com/practice/13ba51c3fec74b58bbc8fa8c3eedf877?tpId=49&tqId=29284&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class MaxInnerRec {

    @Test
    public void test(){
        System.out.println(countArea(new int[]{2,7,9,4,1},5));
    }

    public int countArea(int[] A, int n) {
        int temp;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<A.length; i++){
            temp = i;
            int sum = 0;
            while ((temp-1)>=0 && A[temp-1]>=A[i]){
                sum++;
                temp--;
            }
            temp=i;
            while ((temp+1)<A.length && A[temp+1]>=A[i]){
                sum++;
                temp++;
            }
            list.add((sum+1)*A[i]);
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }

}
