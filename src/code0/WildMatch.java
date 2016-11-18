package code0;

import org.junit.Test;

/**
 * Created by Knight_JXNU on 2016/11/18.
 * 字符串通配
 * http://www.nowcoder.com/practice/28acd1134e344040ad105b3786a79e7a?tpId=49&tqId=29355&rp=5&ru=/ta/2016test&qru=/ta/2016test/question-ranking
 */
public class WildMatch {

    @Test
    public void test(){
//        System.out.println(chkWildMatch("abcd",4,".*", 2));
//        System.out.println(chkWildMatch("aaaabcd",7,"a*abcd",6));
        System.out.println(chkWildMatch("mcgzomxmfmm",11,"mcgzom.*m",9));
    }

    public boolean chkWildMatch(String A, int lena, String B, int lenb) {
        int aPoint = 0;
        int bPoint = 0;
        B = replaceSXS(B);
        lenb = B.length();
        char aChars[] = A.toCharArray();
        char bChars[] = B.toCharArray();
        while(aPoint<lena && bPoint<lenb){
            if(aChars[aPoint]==bChars[bPoint] || bChars[bPoint]=='.'){
                aPoint++;
                bPoint++;
            }else{
                if(bChars[bPoint]=='*'){
                    if(bPoint+1<lenb && aChars[aPoint]==bChars[bPoint+1]){
                        aPoint++;
                        bPoint+=2;
                    }else{
                        bPoint--;
                    }
                }else{
                    return false;
                }
            }
        }
        if(aPoint==lena){
            return true;
        }else{
            return false;
        }
    }

    private String replaceSXS(String str){
        char chars[] = str.toCharArray();
        for(int i=1; i<str.length()-1; i++){
            if(chars[i]=='*' && (chars[i-1]==chars[i+1] || chars[i-1]=='.')){
                return replaceSXS(str.substring(0, i+1)+str.substring(i+2));
            }
        }
        return str;
    }
}
