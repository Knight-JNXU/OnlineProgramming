package code0;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Knight_JXNU on 2016/11/16.
 * 二维数组打印
 * http://www.nowcoder.com/practice/6fadc1dac83a443c9434f350a5803b51?tpId=49&tqId=29316&rp=3&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class Printer {

    @Test
    public void test(){
        System.out.println(Arrays.toString(arrayPrint(new int[][]{{1,2,3,4},
                {5,6,7,8},{9,10,11,12},{13,14,15,16}}, 4)));
    }

    public int[] arrayPrint(int[][] arr, int n) {
        int added = 0;
        int len = n*n;
        int array[] = new int[len];
        int i=0, j=n-1;
        int outStackN = n-1;
        boolean changeFlag;
        while(added < len){
            array[added++] = arr[i][j];
            changeFlag = false;
            if(j+1 >= n){
                outStackN--;
                if(outStackN>=0){
                    i = 0;
                    j=outStackN;
                }else{
                    i=Math.abs(outStackN);
                    j=0;
                }
                changeFlag = true;
            }
            if(i+1 >= n){
                outStackN--;
                i=Math.abs(outStackN);
                j=0;
                changeFlag = true;
            }
            if(!changeFlag){
                i=i+1;
                j=j+1;
            }
        }
        return array;
    }
}
