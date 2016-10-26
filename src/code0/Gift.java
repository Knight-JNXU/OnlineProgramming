package code0;

import org.junit.Test;

import java.util.*;

/**
 * Created by Knight_JXNU on 2016/10/26.
 * http://www.nowcoder.com/practice/fbcf95ed620f42a88be24eb2cd57ec54?tpId=49&tqId=29311&rp=3&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class Gift {

    @Test
    public void test(){
        System.out.println(getValue(new int[]{1,2,3,2,2}, 5));
    }

    public int getValue(int[] gifts, int n) {
        if(n==1){
            return gifts[0];
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(gifts[i]);
        }
        Collections.sort(list);
        int times = 1;
        for(int i=0; i<n-1; i++){
            if(list.get(i).equals(list.get(i+1))){
                times++;
            }else{
                if(times > n/2){
                    return list.get(i);
                }
                times=1;
            }
        }
        return 0;
    }
}
