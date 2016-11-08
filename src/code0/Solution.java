package code0;

/**
 * Created by Knight_JXNU on 2016/11/8.
 * http://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&tqId=11165&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
 */
public class Solution {
    public double Power(double base, int exponent) {
        double result = 1;
        if(exponent >= 0){
            for(int i=0; i<exponent; i++){
                result *= base;
            }
        }else{
            for(int i=0; i<-exponent; i++){
                result /= base;
            }
        }
        return result;
    }
}
