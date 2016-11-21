package code0;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Knight_JXNU on 2016/11/21.
 * 逆序栈
 * http://www.nowcoder.com/practice/ba7d7f5d1edf4d1690d66e12e951f6ea?tpId=49&tqId=29367&rp=5&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class ReverseStack {

    @Test
    public void test(){
        System.out.println(Arrays.toString(reverseStackRecursively(new int[]{1,2,3,4,5},5)));
    }

    public int[] reverseStackRecursively(int[] stack, int top) {
        int newArr[] = new int[stack.length];
        for(int i=0; i<stack.length; i++){
            newArr[i] = stack[stack.length-1-i];
        }
        return newArr;
    }
}
