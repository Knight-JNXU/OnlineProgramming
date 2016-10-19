package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/10/19.
 * http://www.nowcoder.com/practice/084b6cb2ca934d7daad55355b4445f8a?tpId=49&tqId=29363&rp=5&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class StringPattern {

    @Test
    public void test(){
        System.out.println(findAppearance("acbc",4,"bc",2));
    }

    public int findAppearance(String A, int lena, String B, int lenb) {
        return A.indexOf(B);
    }
}
