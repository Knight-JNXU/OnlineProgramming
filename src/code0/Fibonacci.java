package code0;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Knight_JXNU on 2016/11/21.
 * 斐波拉契加强版
 * http://www.nowcoder.com/practice/2393c500d43a4293aa7a662274aff4d1?tpId=49&tqId=29343&rp=4&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class Fibonacci {

    @Test
    public void test(){
        System.out.println(getNthNumber(3));
        System.out.println(getNthNumber(4));
        System.out.println(getNthNumber(90));
    }

    private int mod = 1000000007;
    //递归计算太慢了
    /*public int getNthNumber(int n) {
        if(n==1 || n==2){
            return 1;
        }else{
            return (getNthNumber(n-1)%mod+getNthNumber(n-2)%mod);
        }
    }*/
    private static ArrayList<Integer> list = new ArrayList<>();
    {
        list.add(1);
        list.add(1);
    }
    /*public int getNthNumber(int n) {
        if(n<list.size()){
            return list.get(n);
        }else{
            for(int i=2; i<n; i++){
                list.add(list.get(i-1)%mod+list.get(i-2)%mod);
            }
        }
        return list.get(n-1);
    }*/
    public int getNthNumber(int n) {
        if(n==1 || n==2){
            return 1;
        }else{
            if(list.size()<=n){
                int temp = (getNthNumber(n-1)%mod+getNthNumber(n-2)%mod);
                list.add(temp);
                return temp;
            }else{
                return list.get(n);
            }
        }
    }
}
