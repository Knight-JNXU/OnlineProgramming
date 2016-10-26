package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/10/26.
 * http://www.nowcoder.com/practice/85062aa6016640d188a6a0daf9f5da0e?tpId=49&tqId=29375&rp=6&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class StringRotation {

    @Test
    public void test(){
        System.out.println(rotateString("ABCDEFGH", 8, 4));
    }

    public String rotateString(String A, int n, int p) {
        StringBuffer leftSB = new StringBuffer();
        StringBuffer rightSB = new StringBuffer();
        char chars[] = A.toCharArray();
        for(int i=0; i<n; i++){
            if(i <= p){
                leftSB.append(chars[i]);
            }else{
                rightSB.append(chars[i]);
            }
        }
        return rightSB.toString()+leftSB.toString();
    }
}
