package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/11/16.
 * 多数组中位数
 * http://www.nowcoder.com/practice/c001f4e9820447189110da5e882aa158?tpId=49&tqId=29340&rp=4&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class ManyArrMedian {

    @Test
    public void test(){
        System.out.println(getUpMedian(new int[]{1,2,3,4}, new int[]{3,4,5,6}));
        System.out.println(getUpMedian(new int[]{0,1,2}, new int[]{3,4,5}));
    }

    public int getUpMedian(int[] arr1, int[] arr2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0; i<arr1.length; i++){
            list1.add(arr1[i]);
        }
        for(int i=0; i<arr2.length; i++){
            list2.add(arr2[i]);
        }
        list1.addAll(list2);
        Collections.sort(list1);
        return list1.get(list1.size()/2-1);
    }
}
