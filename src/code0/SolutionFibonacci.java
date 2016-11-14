package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/11/14.
 * 斐波那契数列
 * http://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class SolutionFibonacci {

    @Test
    public void test(){
        System.out.println(Fibonacci(0));
    }
    private static int len = 40;
    private static int fib[] = new int[len];
    static {
        fib[0] = 0;
        fib[1] = 1;
        for(int i=2; i<len; i++){
            fib[i] = fib[i-1]+fib[i-2];
        }
    }
    public int Fibonacci(int n) {
        return fib[n];
    }
}
